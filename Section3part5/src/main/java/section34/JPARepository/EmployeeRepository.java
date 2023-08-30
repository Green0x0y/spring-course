package section34.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;
import section34.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
