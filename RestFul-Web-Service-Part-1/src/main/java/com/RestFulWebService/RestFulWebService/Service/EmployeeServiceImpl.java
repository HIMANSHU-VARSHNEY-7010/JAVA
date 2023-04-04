package com.RestFulWebService.RestFulWebService.Service;

import com.RestFulWebService.RestFulWebService.Entity.Employee;
import com.RestFulWebService.RestFulWebService.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    @Override
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Override
    public Employee findEmployee(Integer empId){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.stream().filter(e -> Objects.equals(e.getEmpID(), empId)).findFirst().orElse(null);
    }
    @Override
    public void deleteEmployee(Integer empId){
        employeeRepository.deleteById(empId);
    }
}
