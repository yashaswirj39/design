package com.example.systemdesign.parkinglot.services;

import java.util.List;

public interface CommonRepositoryService<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T t);
    void deleteAll();
    void deleteById(ID id);
    void delete(T t);
}