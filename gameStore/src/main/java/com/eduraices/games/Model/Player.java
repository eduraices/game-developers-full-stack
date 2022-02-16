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
@Document(collection = "player")
public class Player {
    @Id
    public String id;
    public String nickname;
    public String type;
    public String assetId;
    public String userId;
    public int level;
    public int points;
    public String [] goals;
    public String [] bag;
    public String [] weapons;
    public int lives;
    public boolean isAlive;
    public boolean isPaused;
    
    public Player () {
        
    }
    
    public Player (String id, String nickname, String type, String assetId, String userId, int level, int points, String [] goals, String [] bag, String [] weapons, int lives, boolean isAlive, boolean isPaused) {
        this.id = id;
        this.nickname = nickname;
        this.type = type;
        this.assetId = assetId;
        this.userId = userId;
        this.level = level;
        this.points = points;
        this.goals = goals;
        this.bag = bag;
        this.weapons = weapons;
        this.lives = lives;
        this.isAlive = isAlive;
        this.isPaused = isPaused;
    }
}
