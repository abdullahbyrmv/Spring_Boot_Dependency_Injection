package com.company.mySpringBootApp.Configuration;

import com.company.mySpringBootApp.Implementations.SwimCoach;
import com.company.mySpringBootApp.Interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
