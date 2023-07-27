package spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.dao.StudentDAO;
import spring.entity.Student;

@SpringBootApplication
public class Section3Application {

	public static void main(String[] args) {
		SpringApplication.run(Section3Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao){
		return runner -> {
			//createStudent(studentDao);
			createMultipleStudents(studentDao);
		};
	}

	private void createMultipleStudents(StudentDAO studentDao) {

		Student student1 = new Student("Anna", "Black", "anna@black.com");
		Student student2 = new Student("Jerry", "White", "jerry@white.com");
		Student student3 = new Student("Tom", "Cat", "tom@cat.com");

		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating student object.");
		Student tempStudent = new Student("Paul", "Doe", "paul@doe.com");

		System.out.println("Saving...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student id: " + tempStudent.getId());
	}

}
