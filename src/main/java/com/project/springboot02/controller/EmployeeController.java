/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.controller;

import com.project.springboot02.entities.Employee;
import com.project.springboot02.entities.Person;
import com.project.springboot02.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jorge
 */
@RestController
@RequestMapping(value = "employee", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveEmployee(@RequestBody Employee employee) {
        System.out.println("nuevo");
        employeeService.add(employee);
    }

    @RequestMapping(value = "{curp}", method = RequestMethod.GET)
    @ResponseBody
    public Person getEmployee(@PathVariable String curp) {
        Person employee = employeeService.read(curp);
        return employee;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getAll() {
        System.out.println("getAll");
        List<Employee> listEmployees = employeeService.readAll();
        return listEmployees;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updatePerson(@RequestBody Employee employee) {
        employeeService.update(employee);
        return true;
    }

    @ResponseBody
    @RequestMapping(value = "{curp}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean deletePerson(@PathVariable String curp) {
        boolean returnValue = employeeService.delete(curp);
        return returnValue;
    }
}
