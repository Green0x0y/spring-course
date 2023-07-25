package spring.boot01.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class VolleyballCoach implements Coach {

    public VolleyballCoach(){
        System.out.println(" In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Train volleyball for 90 minutes today!!! " ;
    }
}
