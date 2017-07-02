/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service;

import com.project.springboot02.entities.Person;
import java.util.List;

/**
 *
 * @author Jorge
 */
public interface PersonService {
    
    List<Person> readAll();
    Person readPerson(String curp);
    boolean deletePerson(String curp);
    boolean updatePerson(Person person);
    boolean addPerson(Person person);
    
}
