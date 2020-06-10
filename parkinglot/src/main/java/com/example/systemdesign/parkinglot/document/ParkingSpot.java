package com.example.systemdesign.parkinglot.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpot {
    @Id
    private String id;
    private String spotType;
    private int availableSpot;
    private int acquiredSpot;
    public String vehicleNumber;
    public boolean isPaid;
    //private Payment payment;
}
