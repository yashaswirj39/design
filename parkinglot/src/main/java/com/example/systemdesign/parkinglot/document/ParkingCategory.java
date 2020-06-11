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
public class ParkingCategory {
    @Id
    private String id;
    private String type;
    private String floorId;
    private String parkingLotId;
}
