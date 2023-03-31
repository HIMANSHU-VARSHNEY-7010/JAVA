package com.RestFulWebService.RestFulWebService.Controller;

import com.RestFulWebService.RestFulWebService.Entity.Employee;
import com.RestFulWebService.RestFulWebService.Exception.EmployeeNotFoundException;
import com.RestFulWebService.RestFulWebService.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/Employees")
    public List<Employee> findAllEmployee() {
        return employeeService.findAll();
    }
    @GetMapping("/Employees/{empId}")
    public Employee findEmployee(@PathVariable int empId) {
        Employee employee = employeeService.findEmployee(empId);
        if(employee==null) throw new EmployeeNotFoundException("empId: " + empId);
        return employee;
    }
    @DeleteMapping("/Employees/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
        employeeService.deleteEmployee(empId);
    }

    @PutMapping("/Employees/{empId}")
    public Employee updateEmployee(@PathVariable int empId,@Valid @RequestBody Employee employee){
        Employee emp = employeeService.findEmployee(empId) ;
        emp.setEmpName(employee.getEmpName());
        emp.setEmpAge(employee.getEmpAge());
        return createEmployee(emp);
    }
    @PostMapping("/Employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
}
