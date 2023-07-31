package section3part2.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section3part2.entity.Student;
import section3part2.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the data

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Adam", "Black"));
        theStudents.add(new Student("Julia", "Brown"));
        theStudents.add(new Student("Mihchael", "Purple"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if((studentId >=theStudents.size()) || (studentId < 0 )){
            throw new StudentNotFoundException("Student number invalid: " + studentId);
        }
        return theStudents.get(studentId);
    }
}
