/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.entities;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Jorge
 */
@Getter
@Setter
public class Bank implements Serializable{

    private String codeSucursal;
    private String nameSucursal;
    private Address address;
    
    
}
