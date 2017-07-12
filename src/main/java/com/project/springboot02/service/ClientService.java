/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service;

import com.project.springboot02.dao.ClientDAO;
import com.project.springboot02.entities.Client;

/**
 *
 * @author Jorge
 */
public interface ClientService extends ServiceInterface <ClientDAO,String,Client>{
    
}
