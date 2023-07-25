package boot02;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Train volleyball for 90 minutes today!";
    }
}
