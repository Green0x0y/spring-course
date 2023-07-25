package spring.boot01;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Train volleyball for 90 minutes today!";
    }
}
