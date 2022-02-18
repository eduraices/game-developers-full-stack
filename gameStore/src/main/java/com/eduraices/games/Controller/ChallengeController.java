/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.games.Controller;


import com.eduraices.games.Model.Challenge;

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
import com.eduraices.games.Repository.ChallengeRepository;

/**

/**
 *
 * @author edu
 */
@CrossOrigin(origins = "*")
@RestController
public class ChallengeController {
    @Autowired
    private ChallengeRepository challengeRepository;
    
    @GetMapping("/challenges")
    public ResponseEntity <Page<Challenge>> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "500") int size) {
        
        try {
            Pageable paging = PageRequest.of(page, size);
            Page <Challenge> response = this.challengeRepository.findAll(paging);
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
    
    @PostMapping("/challenges")
    public ResponseEntity<Challenge> createRoom(@RequestBody Challenge body) {
        try {
            
            String id = body.getId();
            String gameId = body.getGameId();
            String roomId = body.getRoomId();
            String matchId = body.getMatchId();
            String creatorId = body.getCreatorId();    
            String receiver = body.getReceiver();
            String message = body.getMessage();
            boolean isAccepted = body.getIsAccepted();
            boolean isRejected = body.getIsRejected();
            
            
            Challenge newChallenge = challengeRepository.save(new Challenge(id, gameId, roomId, matchId, creatorId, receiver, message, isAccepted, isRejected ));
            return new ResponseEntity<>(newChallenge, HttpStatus.CREATED);
            
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
