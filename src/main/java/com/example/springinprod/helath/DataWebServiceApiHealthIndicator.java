package com.example.springinprod.helath;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DataWebServiceApiHealthIndicator implements HealthIndicator {
    private static final String MESSAGE_KEY = "DataWebServiceApi";

    @Override
    public Health health() {
        if (!IsServiceUp()){
            return Health.down().withDetail(MESSAGE_KEY,"down").build();
        }
        return Health.up().withDetail(MESSAGE_KEY,"up").build();
    }
    private Boolean IsServiceUp(){
        return true;
    }
}
