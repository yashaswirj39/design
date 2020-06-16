package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ParkingSpotRepository extends MongoRepository<ParkingSpot, String> {
    void deleteByParkingLotId(String id);
    void deleteByFloorId(String id);
    List<ParkingSpot> findByParkingLotId(String id);
    @Query(value = "{'id': ?0, 'parkingLotId': ?1, 'floorId': ?2}", delete = true)
    void deleteParkingSpotByIdAndParkingLotIdAndFloorId(String id, String parkingLotId, String floorId);
}
