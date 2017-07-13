/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service.impl;

import com.project.springboot02.dao.BankAccountDAO;
import com.project.springboot02.entities.BankAccount;
import com.project.springboot02.service.BankAccountService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
public class BankAccountServiceImpl extends AbstractService<BankAccountDAO,String,BankAccount> implements BankAccountService{
    
}
