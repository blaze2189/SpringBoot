/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.springboot02.dao;

import java.util.List;

/**
 *
 * @author Jorge
 * @param <K>
 * @param <O>
 */
public interface DAO<K, O> {

    List<O> readAll();

    O read(K key);

    boolean delete(K key);

    boolean update(O object);

    boolean add(O object);

}
