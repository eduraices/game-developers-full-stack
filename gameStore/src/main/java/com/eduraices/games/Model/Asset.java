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
@Document(collection = "asset")
public class Asset {
    @Id
    public String id;
    public String title;
    public String type;
    public String source;
    
    public Asset () {
        
    }
    
    public Asset (String id, String title, String type, String source) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.source = source;
    }
    
    
}
