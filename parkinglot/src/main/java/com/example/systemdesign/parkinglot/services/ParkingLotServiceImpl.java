package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.ParkingLot;
import com.example.systemdesign.parkinglot.repos.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingLotServiceImpl implements CommonRepositoryService<ParkingLot, String>{

    private final ParkingLotRepository repositoryService;

    public ParkingLotServiceImpl(ParkingLotRepository repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public List<ParkingLot> findAll() {
        return repositoryService.findAll();
    }

    @Override
    public Optional<ParkingLot> findById(String id) {
        return repositoryService.findById(id);
    }

    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        return repositoryService.save(parkingLot);
    }

    @Override
    public void deleteAll() {
        repositoryService.deleteAll();
    }

    @Override
    public void deleteById(String id) {
        repositoryService.deleteById(id);
    }

    @Override
    public void delete(ParkingLot parkingLot) {
        repositoryService.delete(parkingLot);
    }

    @Override
    public void deleteByFloorId(String id) {}
}
