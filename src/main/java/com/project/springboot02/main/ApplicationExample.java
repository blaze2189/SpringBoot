/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.project.springboot02.controller","com.project.springboot02.service.impl","com.project.springboot02.dao.impl"})
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationExample {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationExample.class, args);
    }
}