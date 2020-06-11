package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ParkingSpotRepository extends MongoRepository<ParkingSpot, String> {
    void deleteByParkingLotId(String id);
    void deleteByFloorId(String id);
    List<ParkingSpot> findByParkingLotId(String id);
}
