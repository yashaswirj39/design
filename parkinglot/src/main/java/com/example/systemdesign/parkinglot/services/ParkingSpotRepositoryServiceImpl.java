package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.ParkingSpot;
import com.example.systemdesign.parkinglot.repos.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingSpotRepositoryServiceImpl implements
                                                CommonRepositoryService<ParkingSpot, String>{

    private final ParkingSpotRepository repositoryService;

    public ParkingSpotRepositoryServiceImpl(ParkingSpotRepository repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public List<ParkingSpot> findAll() {
        return repositoryService.findAll();
    }

    @Override
    public Optional<ParkingSpot> findById(String id) {
        return repositoryService.findById(id);
    }

    @Override
    public ParkingSpot save(ParkingSpot parkingSpot) {
        return repositoryService.save(parkingSpot);
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
    public void delete(ParkingSpot parkingSpot) {
        repositoryService.delete(parkingSpot);
    }

    @Override
    public void deleteByParkingLotId(String id) {
        repositoryService.deleteByParkingLotId(id);
    }
}
