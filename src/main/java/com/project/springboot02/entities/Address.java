/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jorge
 */
@Getter
@Setter
public class Address {
    
    @JsonProperty
    private String street;
    @JsonProperty
    private String colony;
    @JsonProperty
    private String municipality;
    @JsonProperty
    private Integer numberBank;
    @JsonProperty
    private String zipCode;
    
    
}
