package com.example.systemdesign.parkinglot.services;

import java.util.List;
import java.util.Optional;

public interface CommonRepositoryService<T, ID> {
    List<T> findAll();
    Optional<T> findById(ID id);
    T save(T t);
    void deleteAll();
    void deleteById(ID id);
    void delete(T t);
    void deleteByParkingLotId(String id);
}