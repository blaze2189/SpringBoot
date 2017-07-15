/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.ClientDAO;
import com.project.springboot02.entities.Address;
import com.project.springboot02.entities.BankAccount;
import com.project.springboot02.entities.Client;
import com.project.springboot02.enumtype.AccountType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public class ClientDAOImpl extends AbstractDAO<String, Client> implements ClientDAO {

    public ClientDAOImpl() {
        mapData = new HashMap<>();

        Client p1 = new Client();
        Client p2 = new Client();
        Client p3 = new Client();

        Address adress = new Address();

        Set<BankAccount> setBankAccount = new HashSet<>();
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountType(AccountType.CREDIT);
        bankAccount.setCash(102.0);
        setBankAccount.add(bankAccount);
        
        bankAccount = new BankAccount();
        bankAccount.setAccountType(AccountType.DEBIT);
        bankAccount.setCash(10.0);
        setBankAccount.add(bankAccount);
        
        p1.setName("Client1");
        p1.setFirstLastName("FirstLastName1");
        p1.setSecondLastName("SecondLastName1");
        p1.setCurp("CURP1");
        p1.setAddress(adress);
        p1.setSetBankAccount(setBankAccount);
        mapData.put(p1.getCurp(),p1);

        p2.setName("Client2");
        p2.setFirstLastName("FirstLastName2");
        p2.setSecondLastName("SecondLastName2");
        p2.setCurp("CURP2");
        p2.setAddress(adress);
        mapData.put(p2.getCurp(),p2);

        p3.setName("Client3");
        p3.setFirstLastName("FirstLastName3");
        p3.setSecondLastName("SecondLastName3");
        p3.setCurp("CURP3");
        p3.setAddress(adress);
        mapData.put(p3.getCurp(),p3);
    }

    @Override
    public boolean add(Client client) {
        Integer actualSize = this.mapData.size();
        this.mapData.put(client.getCurp(), client);
        Integer newSize = this.mapData.size();
        boolean returnValue = actualSize>newSize;
        return returnValue;
    }

    @Override
    public boolean update(Client client) {
        String curp =client.getCurp();
        Client oldClient =this.mapData.get(curp);
        boolean updated = this.mapData.replace(curp, oldClient, client);
        return updated;
    }

    
    
}
