package ru.tyulenev.springboottest.demo.DAO;





import org.springframework.data.repository.CrudRepository;
import ru.tyulenev.springboottest.demo.entity.Employee;

import javax.persistence.PersistenceContext;
import java.util.List;

@PersistenceContext(unitName = "QoldTickets")
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
