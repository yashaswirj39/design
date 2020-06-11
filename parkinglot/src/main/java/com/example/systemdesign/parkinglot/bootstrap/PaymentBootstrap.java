package com.example.systemdesign.parkinglot.bootstrap;

import com.example.systemdesign.parkinglot.idgenerator.GenerateUniqueId;
import com.example.systemdesign.parkinglot.document.Payment;
import com.example.systemdesign.parkinglot.repos.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class PaymentBootstrap implements CommandLineRunner {

    private final PaymentRepository repository;

    public PaymentBootstrap(PaymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*Payment payment = new Payment();
        payment.setId(GenerateUniqueId.generate());
        payment.setAmount(0);
        payment.setInTime(LocalDateTime.now());
        payment.setOutTime(null);
        payment.setPaid(false);
        payment.setPaymentType("dummy_cash");
        payment.setVehicleNumber("dummy_123");
        payment.setParkingLotId("");
        payment.setFloorId("");
        payment.setParkingslotId("");

        log.info("Cleaning up payment data");
        repository.deleteAll();

        log.info("saving dummy payment info");
        repository.insert(payment);

        log.info("payment repository info");
        System.out.println(repository.findAll());*/
    }
}
