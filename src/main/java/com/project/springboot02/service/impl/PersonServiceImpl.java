/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service.impl;

import com.project.springboot02.dao.PersonDAO;
import com.project.springboot02.entities.Person;
import com.project.springboot02.service.PersonService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
public class PersonServiceImpl extends AbstractService<PersonDAO,String,Person> implements PersonService {

    protected final List<Person> PERSON_LIST = new ArrayList<>();

//    public PersonServiceImpl() {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//        
//        Address adress= new Address();
//        
//        p1.setName("Nombre1");
//        p1.setFirstLastName("FirstLastName1");
//        p1.setSecondLastName("SecondLastName1");
//        p1.setCurp("CURP1");
//        p1.setAddress(adress);
//        
//        p2.setName("Nombre2");
//        p2.setFirstLastName("FirstLastName2");
//        p2.setSecondLastName("SecondLastName2");
//        p2.setCurp("CURP2");
//        p2.setAddress(adress);
//        
//        p3.setName("Nombre3");
//        p3.setFirstLastName("FirstLastName3");
//        p3.setSecondLastName("SecondLastName3");
//        p3.setCurp("CURP3");
//        p3.setAddress(adress);
//        
//        PERSON_LIST.add(p1);
//        PERSON_LIST.add(p2);
//        PERSON_LIST.add(p3);
//    }
    
//    @Autowired
//    EmployeeService employeeService;
    
    @Override
    public List<Person> readAll() {
//        List<Employee> lp = employeeService.readAll();
//        for(Person p:lp){
//            System.out.println("nombre "+p.getName());
//        }
        return PERSON_LIST;
    }

    @Override
    public Person readPerson(String curp) {
        Person returnPerson=new Person();
        for(Person p:PERSON_LIST){
            if(curp.equals(p.getCurp())){
                returnPerson=p;
                break;
            }
        }
        return returnPerson;
    }

    @Override
    public boolean deletePerson(String curp) {
        boolean returnDelete=false;
        for(Person p:PERSON_LIST){
            if(curp.equals(p.getCurp())){
                PERSON_LIST.remove(p);
                returnDelete=true;
                break;
            }
        }
        return returnDelete;
    }

    @Override
    public boolean updatePerson(Person person) {
        boolean returnUpdate=false;
        String curp = person.getCurp();
        for(Person p:PERSON_LIST){
            if(curp.equals(p.getCurp())){
                p.setName(person.getName());
                p.setFirstLastName(person.getFirstLastName());
                p.setSecondLastName(person.getSecondLastName());
                p.setSex(person.getSex());
                p.setAddress(person.getAddress());
                p.setAge(person.getAge());
                returnUpdate=true;
                break;
            }
        }
        return returnUpdate;
    }

    @Override
    public boolean addPerson(Person person) {
        PERSON_LIST.add(person);
        return true;
    }
    
}
