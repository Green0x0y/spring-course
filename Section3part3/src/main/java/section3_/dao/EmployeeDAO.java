package section3_.dao;

import section3_.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
