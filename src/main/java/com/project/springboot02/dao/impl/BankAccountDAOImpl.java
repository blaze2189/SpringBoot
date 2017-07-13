/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.BankAccountDAO;
import com.project.springboot02.entities.BankAccount;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public class BankAccountDAOImpl extends AbstractDAO<String,BankAccount> implements BankAccountDAO{
  
}
