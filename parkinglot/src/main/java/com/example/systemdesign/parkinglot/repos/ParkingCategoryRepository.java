package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ParkingCategoryRepository extends MongoRepository<ParkingCategory, String> {
    void deleteByParkingLotId(String id);
    void deleteByFloorId(String id);
    List<ParkingCategory> findByParkingLotId(String id);
}
