package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.common.SwimCoach;
import spring.common.Coach;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
