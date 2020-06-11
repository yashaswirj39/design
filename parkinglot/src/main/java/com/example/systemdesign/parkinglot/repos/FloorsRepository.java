package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.Floors;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FloorsRepository extends MongoRepository<Floors, String> {
    void deleteByParkingLotId(String id);
    List<Floors> findByParkingLotId(String id);
}
