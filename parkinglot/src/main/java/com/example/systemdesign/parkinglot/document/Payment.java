package com.example.systemdesign.parkinglot.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    private String id;
    private String vehicleNumber;
    private double amount;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private String paymentType;
    private boolean isPaid;
    private String parkingLotId;
    private String floorId;
    private String parkingSpotId;
    private String parkingCategoryId;
}
