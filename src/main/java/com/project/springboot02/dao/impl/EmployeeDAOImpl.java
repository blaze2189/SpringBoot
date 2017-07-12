/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.EmployeeDAO;
import com.project.springboot02.entities.Address;
import com.project.springboot02.entities.Employee;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public class EmployeeDAOImpl extends AbstractDAO<String, Employee> implements EmployeeDAO{

    public EmployeeDAOImpl() {
            mapData = new HashMap<>();

        Employee p1 = new Employee();
        Employee p2 = new Employee();
        Employee p3 = new Employee();

        Address adress = new Address();

        p1.setName("Employee1");
        p1.setFirstLastName("FirstLastName1");
        p1.setSecondLastName("SecondLastName1");
        p1.setCurp("CURP1");
        p1.setAddress(adress);
        mapData.put(p1.getCurp(),p1);

        p2.setName("Employee2");
        p2.setFirstLastName("FirstLastName2");
        p2.setSecondLastName("SecondLastName2");
        p2.setCurp("CURP2");
        p2.setAddress(adress);
        mapData.put(p2.getCurp(),p2);

        p3.setName("Employee3");
        p3.setFirstLastName("FirstLastName3");
        p3.setSecondLastName("SecondLastName3");
        p3.setCurp("CURP3");
        p3.setAddress(adress);
        mapData.put(p3.getCurp(),p3);
    }
    
}
