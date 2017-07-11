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
public class Person {
   
    enum SEX{M,F}
    
    @JsonProperty
    private String name;
    @JsonProperty
    private String firstLastName;
    @JsonProperty
    private String secondLastName;
    @JsonProperty
    private Integer age;
    @JsonProperty
    private SEX sex;
    @JsonProperty
    private Address address;
    @JsonProperty
    private String curp;

    public Person() {
    }

    public Person(String name, String firstLastName, String secondLastName, Integer age, SEX sex, Address address, String curp) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.curp = curp;
    }
    
}
