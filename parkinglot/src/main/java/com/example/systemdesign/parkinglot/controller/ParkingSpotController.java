package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find/{id}")
    public ParkingSpot findById(@PathVariable String id) {
        return parkingSpotService.findById(id).get();
    }

    @PostMapping("/add")
    public ParkingSpot add(@RequestBody ParkingSpot spot) {
        return parkingSpotService.save(spot);
    }

    @PutMapping("/update")
    public ParkingSpot update(@RequestBody ParkingSpot spot) {
        return parkingSpotService.save(spot);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ParkingSpot spot) {
        parkingSpotService.deleteParkingSpotByIdAndParkingLotIdAndFloorId(
                spot.getId(),
                spot.getParkingLotId(),
                spot.getFloorId());
    }
}
