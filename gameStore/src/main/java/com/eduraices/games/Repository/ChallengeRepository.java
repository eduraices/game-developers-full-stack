/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eduraices.games.Repository;

import com.eduraices.games.Model.Challenge;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 *
 * @author edu
 */
@EnableMongoRepositories
public interface ChallengeRepository extends MongoRepository<Challenge, String>{
    public Page<Challenge> findById ( String id, Pageable pageable);
}
