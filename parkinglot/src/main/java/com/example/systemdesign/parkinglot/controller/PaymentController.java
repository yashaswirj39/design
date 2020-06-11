package com.example.systemdesign.parkinglot.controller;

import com.example.systemdesign.parkinglot.document.Payment;
import com.example.systemdesign.parkinglot.repos.PaymentRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    private final PaymentRepository repository;

    public PaymentController(PaymentRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public List<Payment> getAllPayment() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addpayment")
    public Payment add(@RequestBody Payment payment) {
        return repository.insert(payment);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/modifypayment")
    public Payment update(@RequestBody Payment payment) {
        return repository.save(payment);
    }
}
