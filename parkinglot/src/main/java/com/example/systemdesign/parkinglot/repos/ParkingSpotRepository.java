package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingSpotRepository extends MongoRepository<ParkingSpot, String> {
    void deleteByParkingLotId(String id);
}
