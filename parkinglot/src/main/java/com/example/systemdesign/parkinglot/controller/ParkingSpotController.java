package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parkingspot")
public class ParkingSpotController {

    private final CommonRepositoryService<ParkingSpot, String> parkingSpotService;

    public ParkingSpotController(CommonRepositoryService<ParkingSpot, String> parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    @GetMapping("/all")
    public List<ParkingSpot> getAll() {
        return parkingSpotService.findAll();
    }
}
