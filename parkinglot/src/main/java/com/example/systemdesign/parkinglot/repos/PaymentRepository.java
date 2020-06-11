package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
