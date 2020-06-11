package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.Floors;
import com.example.systemdesign.parkinglot.repos.FloorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FloorsRepositoryServiceImpl implements CommonRepositoryService<Floors, String> {

    private final FloorsRepository repositoryService;

    public FloorsRepositoryServiceImpl(FloorsRepository repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public List<Floors> findAll() {
        return repositoryService.findAll();
    }

    @Override
    public Optional<Floors> findById(String id) {
        return repositoryService.findById(id);
    }

    @Override
    public Floors save(Floors floors) {
        return repositoryService.save(floors);
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
    public void delete(Floors floors) {
        repositoryService.delete(floors);
    }

    @Override
    public void deleteByParkingLotId(String id) {
        repositoryService.deleteByParkingLotId(id);
    }
}