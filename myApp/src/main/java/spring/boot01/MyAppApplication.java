package spring.boot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"spring.boot01", "boot02"}
)
public class MyAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyAppApplication.class, args);
	}

}
