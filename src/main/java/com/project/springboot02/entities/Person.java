/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Jorge
 */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    
}
