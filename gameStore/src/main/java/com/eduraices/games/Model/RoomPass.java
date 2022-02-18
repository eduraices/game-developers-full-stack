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
@Document(collection = "roomPass")
public class RoomPass {
    @Id
    public String id;
    public String gameId;
    public String roomId;
    public String creatorId;
    public String receiver;
    public String [] receivers;
    public String message;
    public boolean isAccepted;
    public String [] isAcceptedFrom;
    public boolean isRejected;
    public String [] isRejectedFrom;
    
    public RoomPass () {
        
    }
    
    public RoomPass (String id, String gameId, String roomId, String creatorId, String receiver, String message, boolean isAccepted, boolean isRejected) {
        this.id = id;
        this.gameId = gameId;
        this.roomId = roomId;
        this.creatorId = creatorId;
        this.receiver = receiver;
        this.message = message;
        this.isAccepted = isAccepted;
        this.isRejected = isRejected;
    }
    
    public RoomPass (String id, String gameId, String roomId, String [] receivers, String message, String [] isAcceptedFrom, String [] isRejectedFrom) {
        this.id = id;
        this.gameId = gameId;
        this.roomId = roomId;
        this.creatorId = creatorId;
        this.receivers = receivers;
        this.message = message;
        this.isAcceptedFrom = isAcceptedFrom;
        this.isRejectedFrom = isRejectedFrom;
    }
    
    public String getId () {
        return this.id;
    }
    
    public String getGameId () {
        return this.gameId;
    }
    
    public String getRoomId () {
        return this.roomId;
    }
    
    public String getCreatorId () {
        return this.creatorId;
    }
    
    public String getReceiver () {
        return this.receiver;
    }
    
    public String [] getReceivers () {
        return this.receivers;
    }
    
    public String getMessage () {
        return this.message;
    }
    
    public boolean getIsAccepted () {
        return this.isAccepted;
    }
    
    public String [] getIsAcceptedFrom () {
        return this.isAcceptedFrom;
    }
    
    public boolean getIsRejected () {
        return this.isRejected;
    }
    
    public String [] getIsRejectedFrom () {
        return this.isRejectedFrom;
    }
    
}

