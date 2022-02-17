/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.games.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *  Filter class to encapsulate Matches and Players By Groups of simmilar profiles
 * @author edu
 */
public class Room {
    @Id
    public String id;
    public String gameId;
    public String creatorId;
    public boolean isPublic;
    public int minLevel;
    public int maxPlayers;
    public int maxConcurrence;
    public int maxPing;
    public String [] matches;
    
    public Room () {
        
    }
    
    public Room (String id, String gameId, String creatorId, boolean isPublic, int minLevel, int maxPlayers, int maxConcurrence, String [] matches) {
        
        this.id = id;
        this.gameId = gameId;
        this.creatorId = creatorId;
        this.isPublic = isPublic;
        this.minLevel = minLevel;
        this.maxPlayers = maxConcurrence;
        this.maxConcurrence = maxConcurrence;
        this.matches = matches;
    }
    
    public Room (String id, String gameId, String creatorId, boolean isPublic, int minLevel, int maxPlayers, int maxConcurrence, int maxPing, String [] matches) {
        
        this.id = id;
        this.gameId = gameId;
        this.creatorId = creatorId;
        this.isPublic = isPublic;
        this.minLevel = minLevel;
        this.maxPlayers = maxConcurrence;
        this.maxConcurrence = maxConcurrence;
        this.maxPing = maxPing;
        this.matches = matches;
    }
}
