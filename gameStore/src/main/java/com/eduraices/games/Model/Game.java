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
@Document(collection = "game")
public class Game {
    @Id
    public String id;
    public String title;
    public String version;
    public String type;
    public boolean multiplayer;
    public String description;
    public String source;
    public boolean isUp;
    public String [] matches;
    public int maxRooms;
    public int maxConcurrence;
    public String [] rooms;
    
    public Game () {
        
    }
    
    public Game (String id, String title, String version, String type, boolean multiplayer, String description, String source, boolean isUp, String [] matches, int maxRooms, int maxConcurrence, String [] rooms) {
        this.id = id;
        this.title = title;
        this.version = version;
        this.type = type;
        this.multiplayer = multiplayer;
        this.description = description;
        this.source = source;
        this.isUp = isUp;
        this.matches = matches;
        this.maxRooms = maxRooms;
        this.maxConcurrence = maxConcurrence;
        this.rooms = rooms;
    }
}
