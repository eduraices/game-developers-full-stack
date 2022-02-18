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
    public String imgId;
    public String [] players;
    public String [] matches;
    public String [] roomsInvitedFrom;
    public String [] matchesInvitedFrom;
    public String [] roomPassesSentTo;
    public String [] challengesSentTo;
    public boolean isOnline;
    public boolean isBanned;
    
    public UserProfile () {
        
    }
    
    public UserProfile (String id, String userId, String name, String imgId, String [] players, String [] matches, boolean isOnline, boolean isBanned) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.imgId = imgId;
        this.players = players;
        this.matches = matches;
        this.isOnline = isOnline;
        this.isBanned = isBanned;
    }
    
    
    public String getId () {
        return this.id;
    }
    
    public String getUserId () {
        return this.userId;
    }
    
    public String getName () {
        return this.name;
    }
    
    public String getImgId () {
        return this.imgId;
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
