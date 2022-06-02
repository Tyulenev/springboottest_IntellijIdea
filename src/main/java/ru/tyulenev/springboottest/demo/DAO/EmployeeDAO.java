package ru.tyulenev.springboottest.demo.DAO;





import ru.tyulenev.springboottest.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployee(int id);

    public void deleteEmp(int id);
}
