/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;;
/**
 *
 * @author Jorge
 */
@Getter
@Setter
public class Client extends Person {
    
    private Date startDate;
    private Date enDate;
    private Set<BankAccount> setBankAccount;
    
}
