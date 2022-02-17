/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.games.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author edu
 */
@Document(collection = "match")
public class Match {
    @Id
    public String id;
    public String title;
    public String type;
    public int level;
    public String creatorId;
    public String roomId;
    public int maxPlayers;
    public int maxTeams;
    public String [] players;
    public String [][] teams;
    public String source;
    public boolean isStarted;
    public boolean isPaused;
    public boolean isUp;
    public String winner;
    
    public Match () {
        
    }
    
    public Match (String id, String title, String type, int level, String creatorId, String roomId, int maxPlayers, String [] players, String source, boolean isStarted, boolean isPaused, boolean isUp, String winner) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.level = level;
        this.creatorId = creatorId;
        this.roomId = roomId;    
        this.maxPlayers = maxPlayers;
        this.players = players;
        this.source = source;
        this.isStarted = isStarted;
        this.isPaused = isPaused;
        this.isUp = isUp;
        this.winner = winner;
    }
    
    public Match (String id, String title, String type, int level, String creatorId, String roomId, String [][] players, String source, boolean isStarted, boolean isPaused, boolean isUp, String winner) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.level = level;
        this.creatorId = creatorId;
        this.roomId = roomId;
        this.teams = players;
        this.source = source;
        this.isStarted = isStarted;
        this.isPaused = isPaused;
        this.isUp = isUp;
        this.winner = winner;
    }
}
