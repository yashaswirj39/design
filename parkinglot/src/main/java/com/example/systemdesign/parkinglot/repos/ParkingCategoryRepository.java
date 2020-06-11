package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingCategoryRepository extends MongoRepository<ParkingCategory, String> {
}
