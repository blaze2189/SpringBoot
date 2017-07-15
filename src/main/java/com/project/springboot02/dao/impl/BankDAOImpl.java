/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.BankDAO;
import com.project.springboot02.entities.Address;
import com.project.springboot02.entities.Bank;
import com.project.springboot02.entities.Client;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public class BankDAOImpl extends AbstractDAO<String, Bank> implements BankDAO {

    public BankDAOImpl() {

        this.mapData = new HashMap<>();

        Bank bank = new Bank();
        bank.setAddress(new Address());
        bank.setCodeSucursal("code1");
        bank.setNameSucursal("Sucursal 1");
        mapData.put(bank.getCodeSucursal(), bank);

        bank = new Bank();
        bank.setAddress(new Address());
        bank.setCodeSucursal("code2");
        bank.setNameSucursal("Sucursal 2");
        mapData.put(bank.getCodeSucursal(), bank);

        bank = new Bank();
        bank.setAddress(new Address());
        bank.setCodeSucursal("code2");
        bank.setNameSucursal("Sucursal 2");
        mapData.put(bank.getCodeSucursal(), bank);

        bank = new Bank();
        bank.setAddress(new Address());
        bank.setCodeSucursal("code3");
        bank.setNameSucursal("Sucursal 3");
        mapData.put(bank.getCodeSucursal(), bank);
    }

    @Override
    public boolean add(Bank bank) {
        Integer actualSize = this.mapData.size();
        this.mapData.put(bank.getCodeSucursal(), bank);
        Integer newSize = this.mapData.size();
        boolean returnValue = actualSize > newSize;
        return returnValue;
    }

    @Override
    public boolean update(Bank bank) {
        String bankCode = bank.getCodeSucursal();
        Bank oldBank = this.mapData.get(bankCode);
        boolean updated = this.mapData.replace(bankCode, oldBank, bank);
        return updated;
    }

}
