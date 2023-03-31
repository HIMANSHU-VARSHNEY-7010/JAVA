package com.RestFulWebService.RestFulWebService.Service;

import com.RestFulWebService.RestFulWebService.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee createEmployee(Employee employee);
    public Employee findEmployee(Integer empId);
    public void deleteEmployee(Integer empId);
}
