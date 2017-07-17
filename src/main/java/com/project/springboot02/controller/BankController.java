/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.controller;

import com.project.springboot02.entities.Bank;
import com.project.springboot02.service.BankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="bank",produces=MediaType.APPLICATION_JSON_VALUE)
public class BankController {
    
    @Autowired
    BankService bankService;
    
    @ResponseBody   
    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveBank(@RequestBody Bank bank){
        bankService.add(bank);
        return true;
    }
    
    @ResponseBody
    @RequestMapping(value="{codeBank}",method=RequestMethod.GET)
    public Bank getPerson(@PathVariable String codeBank){
        Bank bank = bankService.read(codeBank);
        return bank;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.GET)
    public List<Bank> getAll(){
          List<Bank> listBank = bankService.readAll();
        return listBank;
    }
    
    @ResponseBody
    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateBank(@RequestBody Bank bank){
        System.out.println("doing put");
               bankService.update(bank);
        return true;
    }
    
    @ResponseBody
    @RequestMapping(value="{codeBank}", method=RequestMethod.DELETE)
    public boolean deleteBank(@PathVariable String codeBank){
        System.out.println("doing delete");
        boolean returnValue=bankService.delete(codeBank);
        return returnValue;
    }
    
}
