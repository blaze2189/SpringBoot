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
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void savePerson(@RequestBody Person person){
        System.out.println("name "+person.getName());
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
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updatePerson(@RequestBody Person person){
        System.out.println("doing put");
        personService.updatePerson(person);
        return true;
    }
    
    @ResponseBody
    @RequestMapping(value="{curp}", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean deletePerson(@PathVariable String curp){
        System.out.println("doing delete");
        boolean returnValue=personService.deletePerson(curp);
        return returnValue;
    }
}
