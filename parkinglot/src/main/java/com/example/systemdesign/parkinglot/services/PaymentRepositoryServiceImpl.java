package com.example.systemdesign.parkinglot.services;

import com.example.systemdesign.parkinglot.document.Payment;
import com.example.systemdesign.parkinglot.repos.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentRepositoryServiceImpl implements CommonRepositoryService<Payment, String> {

    private final PaymentRepository repositoryService;

    public PaymentRepositoryServiceImpl(PaymentRepository repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public List<Payment> findAll() {
        return repositoryService.findAll();
    }

    @Override
    public Optional<Payment> findById(String id) {
        return repositoryService.findById(id);
    }

    @Override
    public Payment save(Payment payment) {
        return repositoryService.save(payment);
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
    public void delete(Payment payment) {
        repositoryService.delete(payment);
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
    public List<Payment> findByParkingLotId(String id) {
        return repositoryService.findByParkingLotId(id);
    }
}