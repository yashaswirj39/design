package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.*;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class ParkingLotController {

    private final CommonRepositoryService<ParkingLot, String> parkingLotService;
    private final CommonRepositoryService<Floors, String> floorsService;
    private final CommonRepositoryService<ParkingCategory, String> parkingCategoryService;
    private final CommonRepositoryService<ParkingSpot, String> parkingSpotService;
    private final CommonRepositoryService<Payment, String> paymentService;

    public ParkingLotController(@Qualifier("parkingLotServiceImpl") CommonRepositoryService<ParkingLot, String> parkingLotService,
                                @Qualifier("floorsRepositoryServiceImpl") CommonRepositoryService<Floors, String> floorsService,
                                @Qualifier("parkingCategoryRepositoryServiceImpl") CommonRepositoryService<ParkingCategory, String> parkingCategoryService,
                                @Qualifier("parkingSpotRepositoryServiceImpl") CommonRepositoryService<ParkingSpot, String> parkingSpotService,
                                @Qualifier("paymentRepositoryServiceImpl") CommonRepositoryService<Payment, String> paymentService) {

        this.parkingLotService = parkingLotService;
        this.floorsService = floorsService;
        this.parkingCategoryService = parkingCategoryService;
        this.parkingSpotService = parkingSpotService;
        this.paymentService = paymentService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<ParkingLot> getAllParkingLot() {
        return parkingLotService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addparkinglot")
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot) {
        return parkingLotService.save(parkingLot);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteparkinglot/{id}")
    public void removeParkingLot(@PathVariable String id) {
        parkingSpotService.deleteByParkingLotId(id);
        parkingCategoryService.deleteByParkingLotId(id);
        floorsService.deleteByParkingLotId(id);
        paymentService.deleteByParkingLotId(id);
        parkingLotService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateparkinglot")
    public ParkingLot update(@RequestBody ParkingLot parkingLot) {
        return parkingLotService.save(parkingLot);
    }
}