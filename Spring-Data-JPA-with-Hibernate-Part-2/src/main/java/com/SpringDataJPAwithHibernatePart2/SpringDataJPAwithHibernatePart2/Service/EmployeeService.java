package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployee();
    public Employee getEmployeeById(int id);
    public String addEmployee(Employee employee);
    public String updateEmployee(int id,Employee employee);
    public String deleteEmployee(int id);
    public List<Object[]> displayNameSorted();
    public void updateMinSalary(int newSalary);
    public void deleteMinSalary(int minSalary);
    public List<Object[]> findByLastName();
    public void deleteEmployeeOnAge(int maxAge);
}
