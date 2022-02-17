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
@Document(collection = "userProfile")
public class UserProfile {
    @Id
    public String id;
    public String userId;
    public String name;
    public String [] players;
    public String [] matches;
    public boolean isOnline;
    public boolean isBanned;
    
    public UserProfile () {
        
    }
    
    public UserProfile (String name, String [] players, String [] matches, boolean isOnline, boolean isBanned) {
        this.name = name;
        this.players = players;
        this.matches = matches;
        this.isOnline = isOnline;
        this.isBanned = isBanned;
    }
    
    public String getName () {
        return this.name;
    }
    
    public String [] getPlayers () {
        return this.players;
    }
    
    public String [] getMatches () {
        return this.matches;
    }
    
    public boolean getIsOnline () {
        return this.isOnline;
    }
    
    public boolean getIsBanned () {
        return this.isBanned;
    }
    
}
