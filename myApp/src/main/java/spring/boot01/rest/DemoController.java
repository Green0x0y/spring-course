package spring.boot01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot01.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    // when dependencies are required
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    //when dependencies are optional
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDatilyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
