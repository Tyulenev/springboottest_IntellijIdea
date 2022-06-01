package ru.tyulenev.springboottest.demo.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tyulenev.springboottest.demo.entity.Employee;


import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);


//        Query query =  session.createQuery("from Employee", Employee.class);
//        List<Employee> allEmployees = query.getResultList();
        List<Employee> allEmployees =
                session.createQuery("from Employee").list();

//        for (Employee emp:allEmployees) {
//            System.out.println(emp);
//        }

        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee emp) {
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(emp);
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee emp = session.get(Employee.class, id);
//
//        return emp;
//    }
//
//    @Override
//    public void deleteEmp(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee " +
//                "where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }
}
