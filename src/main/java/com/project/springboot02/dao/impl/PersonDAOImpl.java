/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.PersonDAO;
import com.project.springboot02.entities.Person;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public class PersonDAOImpl extends AbstractDAO<String,Person> implements PersonDAO {
    
}
