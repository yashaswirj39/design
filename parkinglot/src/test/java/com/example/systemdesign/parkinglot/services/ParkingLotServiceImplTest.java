package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.ParkingLot;
import com.example.systemdesign.parkinglot.repos.ParkingLotRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ParkingLotServiceImplTest {

    @Autowired
    ParkingLotRepository repository;

    ParkingLotServiceImpl impl;

    @BeforeEach
    void setUp() {
        impl = new ParkingLotServiceImpl(repository);
    }

    @Test
    void findAll() {
        assertEquals(3, impl.findAll().size());
    }

    @Test
    void findById() {
        Optional<ParkingLot> lot = impl.findById("05242016-fbfc-470e-b829-92f6ba04c5de");
        assertEquals("321", lot.get().getLatitude());
    }

    @Test
    void save() {
        ParkingLot lot = new ParkingLot();
        lot.setEntry("dummy_entry");
        lot.setExit("dummy_exit");
        lot.setLongitude("12");
        lot.setLatitude("34");
        ParkingLot test1 = impl.save(lot);
        assertEquals(test1,lot);
    }

    @Test
    void deleteAll() throws Exception {

    }

    @Test
    void deleteById() throws Exception {
    }

    @Test
    void delete() throws Exception {
    }

    @Test
    public void deleteByParkingLotId() throws Exception {

    }
}