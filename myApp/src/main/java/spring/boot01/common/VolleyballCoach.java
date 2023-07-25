package spring.boot01.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VolleyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Train volleyball for 90 minutes today!!!";
    }
}
