package com.company.mySpringBootApp.Implementations;

import com.company.mySpringBootApp.Interfaces.Coach;
import org.springframework.stereotype.Component;

@Component("football")
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Football";
    }

    public FootballCoach() {
        System.out.println("Inside Constructor: FootballCoach");
    }
}
