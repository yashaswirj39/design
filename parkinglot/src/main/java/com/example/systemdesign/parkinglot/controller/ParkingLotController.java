package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.Floors;
import com.example.systemdesign.parkinglot.document.ParkingLot;
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
        return repository.save(parkingLot);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteparkinglot/{id}")
    public void removeParkingLot(@PathVariable String id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addfloor")
    public String addFloor(@RequestBody ParkingLot parkingLot) {
        Optional<ParkingLot> lot = repository.findById(parkingLot.getId());
        if (lot.get().getId().equalsIgnoreCase(parkingLot.getId())) {
            List<Floors> floors = lot.get().getFloorsList();
            floors.addAll(parkingLot.getFloorsList());
            parkingLot.setFloorsList(floors);
            repository.save(parkingLot);
            return "floor for parking lot id: " + parkingLot.getId() + "is added";
        } else {
            return "parking lot id: " + parkingLot.getId() + "does not exists";
        }
    }

    //todo update parking lot
    //todo update floor
    //todo add spot
    //todo update spot
}