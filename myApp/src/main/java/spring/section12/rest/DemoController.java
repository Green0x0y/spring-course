package spring.section12.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.section12.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    // when dependencies are required
    @Autowired
    public DemoController(
            @Qualifier("swimCoach") Coach theCoach){
        myCoach = theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
