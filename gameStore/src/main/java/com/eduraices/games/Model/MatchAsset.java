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
@Document(collection = "matchAsset")
public class MatchAsset {
    @Id
    public String id;
    public String matchId;
    public String assetId;
    public String type;
    public double x;
    public double y;
    public int level;
    public double size;
    public double color;
    public String text;
    
    public MatchAsset () {
        
    }
    
    public MatchAsset (String id, String matchId, String assetId, double x, double y, int level, double size, double color, String text) {
        this.id = id;
        this.matchId = matchId;
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
