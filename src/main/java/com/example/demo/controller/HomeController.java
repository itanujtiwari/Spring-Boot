package com.example.demo.controller;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello!";
    }

    @Autowired
    Coach theCoach;

    @GetMapping("/coach")
    public  String Workout(){
        return theCoach.getDailyWorkout();
    }

}
