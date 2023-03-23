package com.company.mySpringBootApp.Implementations;

import com.company.mySpringBootApp.Interfaces.Coach;
import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Cricket";
    }

    public CricketCoach() {
        System.out.println("Inside Constructor CricketCoach");
    }
}
