package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.Floors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CommonRepositoryService<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T t);

    void deleteAll();

    void deleteById(ID id);

    void delete(T t);

    default void deleteByParkingLotId(String id){};

    default void deleteByFloorId(String id){};

    default List<T> findByParkingLotId(String id) {
        return new ArrayList<>();
    }

    default void deleteParkingSpotByIdAndParkingLotIdAndFloorId(String id, String parkingLotId, String floorId) {
    }
}