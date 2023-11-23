package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Swing your bat 1000 times";
    }
}
