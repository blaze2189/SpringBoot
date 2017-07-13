/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service.impl;

import com.project.springboot02.dao.DAO;
import com.project.springboot02.service.ServiceInterface;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jorge
 * @param <D>
 * @param <K>
 * @param <O>
 */
public abstract class AbstractService <D extends DAO, K extends Serializable , O extends Serializable> implements ServiceInterface<D,K,O> {

    @Autowired
    D dao;

    @Override
    public List<O> readAll() {
        return dao.readAll();
    }

    public O read(K key){
        return (O)dao.read(key);
    }

    public boolean delete(K k){
        return dao.delete(k);
    }

    public boolean update(O o){
        return dao.update(o);
    }

    public boolean add(O o){
        return dao.add(o);
    }

}
