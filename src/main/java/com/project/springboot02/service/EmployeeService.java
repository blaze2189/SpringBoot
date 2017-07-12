/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service;

import com.project.springboot02.dao.EmployeeDAO;
import com.project.springboot02.entities.Employee;

/**
 *
 * @author Jorge
 */
public interface EmployeeService extends ServiceInterface<EmployeeDAO, String, Employee>{

}
