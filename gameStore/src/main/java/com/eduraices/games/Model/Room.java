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
@Document(collection = "room")
public class Room {
    @Id
    public String id;
    public String gameId;
    public String creatorId;
    public String name;
    public boolean isPublic;
    public int minLevel;
    public int maxPlayers;
    public int maxConcurrence;
    public int maxPing;
    public String description;
    public String [] matches;
    
    public Room () {
        
    }
    
    // Default PING constructor (no Ping defined)
    public Room (String id, String gameId, String creatorId, String name, boolean isPublic, int minLevel, int maxPlayers, int maxConcurrence, String description, String [] matches) {
        
        this.id = id;
        this.gameId = gameId;
        this.creatorId = creatorId;
        this.name = name;
        this.isPublic = isPublic;
        this.minLevel = minLevel;
        this.maxPlayers = maxConcurrence;
        this.maxConcurrence = maxConcurrence;
        this.description = description;
        this.matches = matches;
    }
    
    public Room (String id, String gameId, String creatorId, String name, boolean isPublic, int minLevel, int maxPlayers, int maxConcurrence, int maxPing, String description, String [] matches) {
        
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
    
    public String getId () {
        return this.id;
    }
    
    public String getGameId () {
        return this.gameId;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }
    
    public String getName () {
        return this.name;
    }
    
    public boolean getIsPublic () {
        return this.isPublic;
    }
    
    public int getMinLevel () {
        return this.minLevel;
    }
    
    public int getMaxPlayers () {
        return this.maxPlayers;
    }
    
    public int getMaxConcurrence () {
        return this.maxConcurrence;
    }
    
    public int getMaxPing () {
        return this.maxPing;
    }
    
    public String getDescription () {
        return this.description;
    }
    
    public String [] getMatches () {
        return this.matches;
    }
}
