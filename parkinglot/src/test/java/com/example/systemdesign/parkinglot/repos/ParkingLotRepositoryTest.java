package com.example.systemdesign.parkinglot.repos;

import com.example.systemdesign.parkinglot.document.ParkingLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ParkingLotRepositoryTest {

    @Autowired
    private ParkingLotRepository repository;

    @BeforeEach
    void setUp() {
        //repository.deleteAll();
    }

    @Test
    public void findAll() throws Exception {
        int size = repository.findAll().size();
        assertEquals(2, size);
    }

    @Test
    public void save() throws Exception {
        ParkingLot lot = new ParkingLot();
        lot.setLongitude("1234");
        lot.setLatitude("321");
        lot.setExit("exit_1");
        lot.setEntry("entry_1");
        ParkingLot test1 = repository.save(lot);
        assertEquals(test1, lot);
    }

    @Test
    public void updateById() throws Exception{
        ParkingLot lot = new ParkingLot();
        lot.setId("4b5bf470-78e5-4b44-973f-2465a68faf27");
        lot.setLongitude("6546");
        lot.setLatitude("342");
        lot.setExit("exit_1");
        lot.setEntry("entry_1");
        ParkingLot test2 = repository.save(lot);
        assertEquals(test2, lot);
    }

    @Test
    public void findById() {
        Optional<ParkingLot> lot = repository.findById("05242016-fbfc-470e-b829-92f6ba04c5de");
        assertEquals(lot.get().getLatitude(), "321");
    }
}