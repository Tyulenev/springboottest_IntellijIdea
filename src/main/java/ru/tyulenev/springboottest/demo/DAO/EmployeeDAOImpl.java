package ru.tyulenev.springboottest.demo.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tyulenev.springboottest.demo.entity.Employee;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

//        Session session = entityManager.unwrap(Session.class);


//        Query query =  session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();
//        List<Employee> allEmployees =
//                session.createQuery("from Employee").list();

//        for (Employee emp:allEmployees) {
//            System.out.println(emp);
//        }
            Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee emp) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(emp);
        Employee newEmp = entityManager.merge(emp);  //из JPA - это тоже самое что и saveOrUpdate из Hibernate
        emp.setId(newEmp.getId());
    }

    @Override
    public Employee getEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee emp = session.get(Employee.class, id);
            Employee emp = entityManager.find(Employee.class, id);
        return emp;
    }

    @Override
    public void deleteEmp(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Query query = session.createQuery("delete from Employee " +
//                "where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
        Query query = entityManager.createQuery("delete from Employee " +
                   "where id =:employeeId");
                query.setParameter("employeeId", id);
                query.executeUpdate();

    }
}
