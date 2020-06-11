package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.Floors;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FloorsRepository extends MongoRepository<Floors, String> {
    void deleteByParkingLotId(String id);
}
