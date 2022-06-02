package ru.tyulenev.springboottest.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tyulenev.springboottest.demo.DAO.EmployeeDAO;
import ru.tyulenev.springboottest.demo.entity.Employee;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional //Spring открывает и закрывает транзакции
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee emp) {
        employeeDAO.saveEmployee(emp);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeDAO.deleteEmp(id);
    }
}
