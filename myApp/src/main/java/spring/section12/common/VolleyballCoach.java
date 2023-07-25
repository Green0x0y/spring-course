package spring.section12.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class VolleyballCoach implements Coach {

    public VolleyballCoach(){
        System.out.println(" In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Train volleyball for 90 minutes today!!! " ;
    }
}
