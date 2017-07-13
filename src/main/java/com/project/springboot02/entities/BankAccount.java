/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import com.project.springboot02.enumtype.AccountType;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jorge
 */
@Getter
@Setter
public class BankAccount implements Serializable{
    
    private AccountType accountType;
    private Double cash;
    
}
