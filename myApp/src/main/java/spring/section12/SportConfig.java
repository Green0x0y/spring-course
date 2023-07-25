package spring.section12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.section12.common.Coach;
import spring.section12.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
