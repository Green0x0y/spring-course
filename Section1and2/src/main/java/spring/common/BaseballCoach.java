package spring.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println(" In constructor " + getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct BaseballCoach");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy BaseballCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Train baseball for 60 minutes! " + getClass().getSimpleName();
    }
}
