package section3_.service;

import org.springframework.stereotype.Service;
import section3_.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById (int theId);
}
