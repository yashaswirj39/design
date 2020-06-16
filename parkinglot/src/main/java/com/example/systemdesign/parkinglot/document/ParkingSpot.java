package com.example.systemdesign.parkinglot.document;

import com.example.systemdesign.parkinglot.idgenerator.GenerateUniqueId;
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
    private String id = GenerateUniqueId.generate();
    private String categoryType;
    private int availableCount;
    private int acquiredCount;
    private String parkingLotId;
    private String floorId;
    private String parkingCategoryId;
}
