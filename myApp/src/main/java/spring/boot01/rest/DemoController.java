package spring.boot01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot01.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    // when dependencies are required
    @Autowired
    public DemoController(@Qualifier("volleyballCoach") Coach theCoach){
        System.out.println(" In consctructor " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    //when dependencies are optional
//    @Autowired
//    public void setCoach(@Qualifier("baseballCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDatilyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
