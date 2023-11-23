package com.example.demo.common;

import org.springframework.stereotype.Component;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 5 laps of the ground";
    }
}
