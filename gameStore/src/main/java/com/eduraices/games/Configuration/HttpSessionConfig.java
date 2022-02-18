/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eduraices.games.Configuration;

import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.context.annotation.Bean;
import java.time.Duration;

@EnableMongoHttpSession
public class HttpSessionConfig {

    @Bean
    public JdkMongoSessionConverter jdkMongoSessionConverter() {
        return new JdkMongoSessionConverter(Duration.ofMinutes(30));
    }
}

