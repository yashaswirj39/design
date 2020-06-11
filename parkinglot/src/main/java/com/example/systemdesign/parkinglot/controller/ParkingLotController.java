package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.Floors;
import com.example.systemdesign.parkinglot.document.ParkingLot;
import com.example.systemdesign.parkinglot.document.ParkingSpot;
import com.example.systemdesign.parkinglot.idgenerator.GenerateUniqueId;
import com.example.systemdesign.parkinglot.repos.ParkingLotRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class ParkingLotController {

    private final ParkingLotRepository repository;

    public ParkingLotController(ParkingLotRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<ParkingLot> getAllParkingLot() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addparkinglot")
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot) {
        return repository.insert(parkingLot);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteparkinglot/{id}")
    public void removeParkingLot(@PathVariable String id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addfloor")
    public String addFloor(@RequestBody ParkingLot parkingLot) {
        return null;
    }

    //todo update parking lot
    //todo update floor
    //todo add spot
    //todo update spot
}