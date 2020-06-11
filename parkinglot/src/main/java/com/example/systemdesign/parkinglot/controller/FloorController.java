package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.*;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/floor")
public class FloorController {

    private final CommonRepositoryService<Floors, String> floorService;
    private final CommonRepositoryService<ParkingCategory, String> parkingCategoryService;
    private final CommonRepositoryService<ParkingSpot, String> parkingSpotService;
    private final CommonRepositoryService<Payment, String> paymentService;

    public FloorController(
            @Qualifier("floorsRepositoryServiceImpl") CommonRepositoryService<Floors, String> floorsService,
            @Qualifier("parkingCategoryRepositoryServiceImpl") CommonRepositoryService<ParkingCategory, String> parkingCategoryService,
            @Qualifier("parkingSpotRepositoryServiceImpl") CommonRepositoryService<ParkingSpot, String> parkingSpotService,
            @Qualifier("paymentRepositoryServiceImpl") CommonRepositoryService<Payment, String> paymentService) {
        this.floorService = floorsService;
        this.parkingCategoryService = parkingCategoryService;
        this.parkingSpotService = parkingSpotService;
        this.paymentService = paymentService;
    }

    @GetMapping("/all")
    public List<Floors> getAllFloors() {
        return floorService.findAll();
    }

    @GetMapping("/all/{parkingLotId}")
    public List<Floors> getAllFloorsByParkingLotId(@PathVariable String parkingLotId) {
        return floorService.findByParkingLotId(parkingLotId);
    }

    @PostMapping("/addFloor")
    public Floors add(@RequestBody Floors floors) {
        return floorService.save(floors);
    }

    @PutMapping("/updateFloor")
    public Floors update(@RequestBody Floors floors) {
        return floorService.save(floors);
    }

    @DeleteMapping("/deleteFloor/{id}")
    public void deleteById(@PathVariable String id) {
        paymentService.deleteByFloorId(id);
        parkingSpotService.deleteByFloorId(id);
        parkingCategoryService.deleteByFloorId(id);
        floorService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Floors floors) {
        paymentService.deleteByFloorId(floors.getId());
        parkingSpotService.deleteByFloorId(floors.getId());
        parkingCategoryService.deleteByFloorId(floors.getId());
        floorService.delete(floors);
    }
}