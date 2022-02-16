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
@Document(collection = "user")
public class User {
    @Id
    public String id;
    public String name;
    public String email;
    public String [] players;
    public String [] matches;
    public boolean isOnline;
    public boolean isBanned;
    
    public User () {
        
    }
    
    public User (String id, String name, String email, String [] players, String [] matches, boolean isOnline, boolean isBanned) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.players = players;
        this.matches = matches;
        this.isOnline = isOnline;
        this.isBanned = isBanned;
    }
    
}
