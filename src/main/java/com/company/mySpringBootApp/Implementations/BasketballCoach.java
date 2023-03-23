package com.company.mySpringBootApp.Implementations;

import com.company.mySpringBootApp.Interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("basketball")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Basketball";
    }

    @PostConstruct
    public void doMyStartupStaff() {
        System.out.println("Inside of startup method");
    }

    @PreDestroy
    public void doMyCleanupStaff() {
        System.out.println("Inside of cleanup method");
    }

    public BasketballCoach() {
        System.out.println("Inside Constructor BasketballCoach");
    }
}
