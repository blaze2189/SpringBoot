/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service.impl;

import com.project.springboot02.dao.ClientDAO;
import com.project.springboot02.dao.impl.ClientDAOImpl;
import com.project.springboot02.entities.Client;
import com.project.springboot02.service.ClientService;
import com.project.springboot02.service.ServiceInterface;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
public class ClientServiceImpl extends AbstractService<ClientDAO,String,Client> implements ClientService {
    
}
