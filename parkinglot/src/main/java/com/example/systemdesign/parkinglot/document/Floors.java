package com.example.systemdesign.parkinglot.document;

import com.example.systemdesign.parkinglot.idgenerator.GenerateUniqueId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Floors {
    @Id
    private String id = GenerateUniqueId.generate();
    private int floorNumber;
    private String parkingLotId;
}