package section3_.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section3_.entity.Employee;
import section3_.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeRestController {
    private EmployeeService employeeService;

    public EmployeeRestController( EmployeeService theEmployeeService){
        employeeService = theEmployeeService;

    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
