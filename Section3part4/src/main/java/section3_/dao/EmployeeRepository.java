package section3_.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import section3_.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
