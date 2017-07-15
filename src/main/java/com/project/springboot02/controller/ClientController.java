/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.controller;

import com.project.springboot02.entities.Client;
import com.project.springboot02.entities.Person;
import com.project.springboot02.service.ClientService;
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
@RequestMapping(value="client",produces=MediaType.APPLICATION_JSON_VALUE)
public class ClientController {
    
    @Autowired
    ClientService clientService;
    
    @RequestMapping(method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveClient(@RequestBody Client client){
        clientService.add(client);
    }
    
    @RequestMapping(value="{curp}",method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Person getClient(@PathVariable String curp){
        Person returnPerson = clientService.read(curp);
        return returnPerson;
    }
    
    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public List<Client> getAllClients(){
        List<Client> listClients = clientService.readAll();
        return listClients;
    }
    
    @ResponseBody
    @RequestMapping(value="{curp}",method=RequestMethod.DELETE)
    public boolean deleteClient(@PathVariable String curp){
        boolean returnValue = clientService.delete(curp);
        return returnValue;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.PUT)
    public boolean updateClient(@RequestBody Client client){
        boolean returnValue = clientService.update(client);
        return returnValue;
    }

    
}
