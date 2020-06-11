package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.Floors;
import com.example.systemdesign.parkinglot.document.ParkingCategory;
import com.example.systemdesign.parkinglot.repos.ParkingCategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingCategoryRepositoryServiceImpl implements
        CommonRepositoryService<ParkingCategory, String> {

    private final ParkingCategoryRepository repositoryService;

    public ParkingCategoryRepositoryServiceImpl(ParkingCategoryRepository repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public List<ParkingCategory> findAll() {
        return repositoryService.findAll();
    }

    @Override
    public Optional<ParkingCategory> findById(String id) {
        return repositoryService.findById(id);
    }

    @Override
    public ParkingCategory save(ParkingCategory parkingCategory) {
        return repositoryService.save(parkingCategory);
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
    public void delete(ParkingCategory parkingCategory) {
        repositoryService.delete(parkingCategory);
    }

    @Override
    public void deleteByParkingLotId(String id) {
        repositoryService.deleteByParkingLotId(id);
    }

    @Override
    public void deleteByFloorId(String id) {
        repositoryService.deleteByFloorId(id);
    }

    @Override
    public List<ParkingCategory> findByParkingLotId(String id) {
        return repositoryService.findByParkingLotId(id);
    }
}