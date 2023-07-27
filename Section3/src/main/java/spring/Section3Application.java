package spring;

import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.dao.StudentDAO;
import spring.entity.Student;

import java.util.List;

@SpringBootApplication
public class Section3Application {

	public static void main(String[] args) {
		SpringApplication.run(Section3Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao){
		return runner -> {
			// createStudent(studentDao);
			// createMultipleStudents(studentDao);
			// readStudent(studentDao);
			// queryForStudents(studentDao);
			// queryForStudentsByLastName(studentDao);
			updateStudent(studentDao);
		};
	}

	private void updateStudent(StudentDAO studentDao) {
		int studentId = 4;
		Student myStudent = studentDao.findById(studentId);
		myStudent.setFirstName("Jerry");
		studentDao.update(myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDao) {
		List<Student> students = studentDao.findByLastName("Cat");
		for(Student student: students){
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDao) {
		List<Student> studentsList = studentDao.findAll();
		for( Student student: studentsList){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDao) {
		Student student1 = new Student("Tom", "Cat", "tom@cat.com");

		studentDao.save(student1);

		Student myStudent = studentDao.findById(student1.getId());
		System.out.println(myStudent);
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
