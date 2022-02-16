/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eduraices.games.Repository;

import com.eduraices.games.Model.MatchAsset;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 *
 * @author edu
 */
public interface MatchAssetRepository extends MongoRepository<MatchAsset, String>{
    
    public Page<MatchAsset> findById ( String id, Pageable pageable);
}
