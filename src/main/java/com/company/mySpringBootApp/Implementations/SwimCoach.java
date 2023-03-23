package com.company.mySpringBootApp.Implementations;

import com.company.mySpringBootApp.Interfaces.Coach;

public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim Coach";
    }
}
