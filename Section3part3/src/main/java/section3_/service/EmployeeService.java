package section3_.service;

import org.springframework.stereotype.Service;
import section3_.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
