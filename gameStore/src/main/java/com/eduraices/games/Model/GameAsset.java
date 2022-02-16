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
@Document(collection = "gameAsset")
public class GameAsset {
    @Id
    public String id;
    public String gameId;
    public String assetId;
    public String type;
    public double x;
    public double y;
    public int level;
    public double size;
    public String color;
    public String text;
    
    public GameAsset () {
        
    }
    
    public GameAsset (String id, String gameId, String assetId, String type, double x, double y, int level, double size, String color, String text ) {
         
        this.id = id;
        this.gameId = gameId;
        this.assetId = assetId;
        this.type = type;
        this.x = x;
        this.y = y;
        this.level = level;
        this.size = size;
        this.color = color;
        this.text = text;
    }
}
