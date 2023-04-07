package com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Service;

import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployee();
    public Employee getEmployeeByID(int empID);
    public String addEmployee(Employee employee);
    public String updateEmployee(int empID,Employee employee);
    public String deleteEmployee(int empID);
    public long employeeCount();
    public Page<Employee> pagingAndSortingByEmpAge(int pageNo);
    public List<Employee> findByName(String empName);
    public List<Employee> findEmpNameStartsWith(char character);
    public List<Employee> retrieveAge(int empAge1,int empAge2);
}
