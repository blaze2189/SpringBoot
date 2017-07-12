/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.service;

import com.project.springboot02.dao.DAO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jorge
 * @param <D> DAO
 * @param <K> Key for entity
 * @param <O> Object type
 */
public interface ServiceInterface<D extends DAO, K , O > {

    List<O> readAll();

    O read(K key);

    boolean delete(K key);

    boolean update(K key);

    boolean add(K key);

}
