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

    }
}
