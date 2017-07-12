/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service.impl;

import com.project.springboot02.dao.EmployeeDAO;
import com.project.springboot02.entities.Employee;
import com.project.springboot02.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
public class EmployeeServiceImpl extends AbstractService<EmployeeDAO, String, Employee> implements EmployeeService {

}
