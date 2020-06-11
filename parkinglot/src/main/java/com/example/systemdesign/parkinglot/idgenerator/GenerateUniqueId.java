package com.example.systemdesign.parkinglot.idgenerator;

import java.util.UUID;

public class GenerateUniqueId {
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
