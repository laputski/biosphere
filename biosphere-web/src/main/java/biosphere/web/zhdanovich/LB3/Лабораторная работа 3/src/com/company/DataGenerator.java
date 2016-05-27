package com.company;


import java.util.UUID;

/**
 * Created by youhy
 */
public class DataGenerator {

    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }
}
