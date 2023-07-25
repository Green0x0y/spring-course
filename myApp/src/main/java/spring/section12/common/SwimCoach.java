package spring.section12.common;


public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 300 meters!";
    }
}
