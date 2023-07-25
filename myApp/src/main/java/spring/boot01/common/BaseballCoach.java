package spring.boot01.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Train basketball for 60 minutes!";
    }
}
