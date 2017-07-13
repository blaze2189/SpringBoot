/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.enumtype;

import lombok.Getter;

/**
 *
 * @author Jorge
 */
@Getter
public enum AccountType {
    CREDIT("Crdit"),DEBIT("Debit");
    
    private String description;
    
    AccountType(String description){
        this.description=description;
    }
    
}
