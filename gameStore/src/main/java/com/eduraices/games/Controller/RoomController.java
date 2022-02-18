/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.games.Controller;


import com.eduraices.games.Model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.eduraices.games.Repository.RoomRepository;

/**

/**
 *
 * @author edu
 */
@CrossOrigin(origins = "*")
@RestController
public class RoomController {
    
    @Autowired
    private RoomRepository roomRepository;
    
    @GetMapping("/rooms")
    public ResponseEntity <Page<Room>> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "500") int size) {
        
        try {
            Pageable paging = PageRequest.of(page, size);
            Page <Room> response = this.roomRepository.findAll(paging);
            if ( response.isEmpty() ) {
                
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            }
            else {
                
                return ResponseEntity.ok().body(response);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace().toString());
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
            
        }
         
    }
    
    @PostMapping("/rooms")
    public ResponseEntity<Room> createRoom(@RequestBody Room body) {
        try {
            
            String id = body.getId();
            String gameId = body.getGameId();
            String creatorId = body.getCreatorId();
            String name = body.getName();
            boolean isPublic = body.getIsPublic();
            int minLevel = body.getMinLevel();
            int maxPlayers = body.getMaxPlayers();
            int maxConcurrence = body.getMaxConcurrence();
            int maxPing = body.getMaxPing();
            String description = body.getDescription();
            String [] matches = body.getMatches();
            
            
            Room newRoom = roomRepository.save(new Room(id, gameId, creatorId, name, isPublic, minLevel, maxPlayers, maxConcurrence, maxPing, description, matches ));
            
            return new ResponseEntity<>(newRoom, HttpStatus.CREATED);
            
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        // Siguiente paso, VALIDATE, para evitar rectificar luego en todos los métodos
        
        // COPIAR POST method en resto de Controllers
        // primero hacerlo funcionar, 
        // luego, adaptar para hacer Updates en Todas las Tablas Implicadas con Listados, etc.
        
        //, luego Edit, Delete,
        // Por último Session
    }
}
