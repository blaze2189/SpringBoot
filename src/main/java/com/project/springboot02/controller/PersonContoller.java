/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.controller;

import com.project.springboot02.entities.Person;
import com.project.springboot02.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jorge
 */
@RestController
@RequestMapping(value="person",produces=MediaType.APPLICATION_JSON_VALUE)
public class PersonContoller {
    
    @Autowired
    PersonService personService;
    
    @RequestMapping(method=RequestMethod.POST, consumes = "application/json")
    public void savePerson(Person person){
        personService.addPerson(person);
    }
    
    @ResponseBody
    @RequestMapping(value="{curp}",method=RequestMethod.GET)
    public Person getPerson(@PathVariable String curp){
        Person person = personService.readPerson(curp);
        return person;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.GET)
    public List<Person> getAll(){
        List<Person> listPerson = personService.readAll();
        return listPerson;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.PUT, consumes = "application/json")
    public boolean updatePerson(Person person){
        personService.updatePerson(person);
        return true;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.DELETE, consumes = "application/json")
    public boolean deletePerson(String curp){
        personService.deletePerson(curp);
        return false;
    }
}
