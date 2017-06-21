/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.newpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationExample {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationExample.class, args);
    }
}

@RestController
class GreetingController {
    
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}