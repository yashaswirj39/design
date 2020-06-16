package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.Payment;
import com.example.systemdesign.parkinglot.services.CommonRepositoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    private final CommonRepositoryService<Payment, String> paymentService;

    public PaymentController(CommonRepositoryService<Payment, String> paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/info")
    public List<Payment> getAllPayment() {
        return paymentService.findAll();
    }

    @PostMapping("/addpayment")
    public Payment add(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @PutMapping("/modifypayment")
    public Payment update(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        paymentService.deleteById(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Payment payment) {
        paymentService.delete(payment);
    }
}
