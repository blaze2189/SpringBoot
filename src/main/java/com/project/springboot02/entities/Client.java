/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty
    private Date startDate;
    @JsonProperty
    private Date enDate;
    @JsonProperty
    private Set<BankAccount> setBankAccount;
    
}
