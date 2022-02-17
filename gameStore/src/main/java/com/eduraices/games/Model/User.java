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
    public String email;
    public String profileId;
    
    public User () {
        
    }
    
    public User (String id, String email) {
        this.id = id;
        this.email = email;
        
    }
    
    public User (String id, String email, String profileId) {
        this.id = id;
        this.email = email;
        this.profileId = profileId;
        
    }
    
    public String getId () {
        return this.id;
    }
    
    public String getEmail () {
        return this.email;
    }
    
    public String getProfileId () {
        return this.profileId;
    }
    
}
