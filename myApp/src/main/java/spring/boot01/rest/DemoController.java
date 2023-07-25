package spring.boot01.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot01.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // when dependencies are required
    @Autowired
    public DemoController(
            @Qualifier("volleyballCoach") Coach theCoach,
            @Qualifier("volleyballCoach") Coach theAnotherCoach){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;

    }

    //when dependencies are optional
//    @Autowired
//    public void setCoach(@Qualifier("baseballCoach") Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/check")
    public String checkIfSingleton() {
        return "Result: " +  (myCoach == anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDatilyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
