/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao.impl;

import com.project.springboot02.dao.DAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jorge
 */
public abstract class AbstractDAO<K extends Serializable,O> implements DAO<K,O> {

    protected Map<K,O> mapData;
    
    @Override
    public List<O> readAll() {
        List<O> listData = new ArrayList<>();
        for(K k: mapData.keySet()){
            O object = mapData.get(k);
            listData.add(object);
        }
        return listData;
    }

    @Override
    public O read(K key) {
        O object = mapData.get(key);
        return object;
    }

    @Override
    public boolean delete(K key) {
        mapData.remove(key);
        return true;
    }

    @Override
    public boolean update(O object) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public boolean add(O o) {
        throw new UnsupportedOperationException("not implemented");
    }
    
}
