package com.example.systemdesign.parkinglot;

import java.util.UUID;

public class GenerateUniqueId {
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
