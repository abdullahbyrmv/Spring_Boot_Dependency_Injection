package com.company.mySpringBootApp.restController;

import com.company.mySpringBootApp.Interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for dependency
    private Coach myCoach;
    private Coach myCoach2;

//    @Autowired // Constructor Injection
//    public DemoController(@Qualifier("basketball") Coach coach, @Qualifier("basketball") Coach coach2) {
//        this.myCoach = coach;
//        this.myCoach2 = coach2;
//    }

    @Autowired
    public void injection(@Qualifier("swimCoach") Coach coach) {
        this.myCoach2 = coach;
    }

    @GetMapping("/dailyworkout")
    public String mainPage() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Checking for the comparison of addresses of objects is " + (myCoach == myCoach2);
    }

    @GetMapping("/checkforbean")
    public String checkForBean() {
        return myCoach2.getDailyWorkout();
    }
}
