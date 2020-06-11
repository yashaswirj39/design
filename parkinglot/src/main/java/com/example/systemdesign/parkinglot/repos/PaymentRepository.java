package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentRepository extends MongoRepository<Payment, String> {
    void deleteByParkingLotId(String id);
    void deleteByFloorId(String id);
    List<Payment> findByParkingLotId(String id);
}
