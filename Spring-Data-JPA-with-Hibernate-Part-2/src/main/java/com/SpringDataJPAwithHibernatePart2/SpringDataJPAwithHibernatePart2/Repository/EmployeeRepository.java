package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Repository;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Employee;
import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//  1. Display the first name, last name of all employees having salary greater than average salary
//      ordered in ascending by their age and in descending by their salary.
    @Query("select firstName, lastName from Employee where salary >(select avg(salary) from Employee ) " +
            "ORDER BY age ASC , salary DESC")
    List<Object[]> displayName();

//  2. Update salary of all employees by a salary passed as a parameter whose existing salary is less than
//      the average salary.
    @Modifying
    @Query("update Employee set salary = :newSalary where salary < :avgSalary")
    void updateSal(@PathParam("newSalary") int newSalary, @PathParam("avgSalary") int avgSalary);

    @Query("select avg(salary) from Employee")
    int avgSalary();

//  3. Delete all employees with minimum salary.
    @Modifying
    @Query("delete from Employee where salary < :minSalary")
    void deleteWithMinSal(@PathParam("minSalary") int minSalary) ;

//      >>      >>      Native Query       <<    <<

//  1. Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value = "select emp_id , emp_firstname , emp_age  from employee_table where emp_lastname like '%singh' " ,
            nativeQuery = true)
    List<Object[]> findLastName();

//  2. Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Query(value = "delete from employee_table where emp_age > :maxAge" , nativeQuery = true)
    void deleteEmpOnAge(@PathParam("maxAge") int maxAge);

}
