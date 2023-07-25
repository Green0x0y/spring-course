package spring.boot01.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println(" In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Train baseball for 60 minutes! " + getClass().getSimpleName();
    }
}
