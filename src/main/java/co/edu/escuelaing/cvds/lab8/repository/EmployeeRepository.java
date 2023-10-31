package co.edu.escuelaing.cvds.lab8.repository;

import co.edu.escuelaing.cvds.lab8.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
