package ru.tyulenev.springboottest.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.tyulenev.springboottest.demo.Service.EmployeeService;
import ru.tyulenev.springboottest.demo.Service.EmployeeServiceImpl;
import ru.tyulenev.springboottest.demo.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyREESTController {

    @Autowired
    private EmployeeServiceImpl employeeService;

//    @ResponseBody
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> showAllEmployees() {
        List<Employee> allEmpl = employeeService.getAllEmps();
        return allEmpl;
    }


//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id) {
//        Employee emp = employeeService.getEmployee(id);
//
//        return emp;
//    }
//
//    @PostMapping("/add-employee")
//    public Employee addNewEmployee(@RequestBody Employee emp) {
//        employeeService.saveEmployee(emp);
//        return emp;
//    }
//
//    @DeleteMapping("/del-employee/{id}")
//    public String deleteEmps (@PathVariable int id) {
//        employeeService.deleteEmp(id);
//        return "Employee with id = " + id + " was deleted";
//    }

    @GetMapping("/test1")
    public String test1 () {
        return "test1 !!!!!";
    }
}
