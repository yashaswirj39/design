package com.example.systemdesign.parkinglot.bootstrap;

import com.example.systemdesign.parkinglot.document.Floors;
import com.example.systemdesign.parkinglot.document.ParkingLot;
import com.example.systemdesign.parkinglot.document.ParkingSpot;
import com.example.systemdesign.parkinglot.document.Payment;
import com.example.systemdesign.parkinglot.repos.ParkingLotRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

@Component
@Slf4j
public class DBSeeder implements CommandLineRunner {

    private final ParkingLotRepository repository;

    public DBSeeder(ParkingLotRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(UUID.randomUUID().toString());
        parkingLot.setEntry("Entry1");
        parkingLot.setExit("Exit1");
        parkingLot.setLatitude("1234");
        parkingLot.setLongitude("4321");
        parkingLot.setFloorsList(Arrays.asList(
                new Floors(UUID.randomUUID().toString(),
                        Arrays.asList(new ParkingSpot(
                                UUID.randomUUID().toString(),
                                "Bike",
                                10,
                                0,
                                new Payment())))
        ));
        /*log.info("Cleaning up data");
        repository.deleteAll();*/

        log.info("Saving bootstrap data into repository");
        repository.save(parkingLot);
        log.info("fetching data from repository for confirmation");
        log.info(String.valueOf(repository.findAll()));
    }
}
