package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Controller;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Employee;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){
        String result;
        result = employeeService.addEmployee(employee);
        return result;
    }

    @PutMapping("/employee/{id}")
    public String updateEmployeeByID(@PathVariable int id,@RequestBody Employee employee){
        String result;
        result = employeeService.updateEmployee(id, employee);
        return result;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeByID(@PathVariable int id){
        String result;
        result = employeeService.deleteEmployee(id);
        return result;
    }


    @GetMapping("/employee")
    public List<Employee> findAllEmployee(){
        List<Employee> employeeList;
        employeeList = employeeService.getEmployee();
        return employeeList;
    }

    @GetMapping("/employee/{id}")
    public Employee findEmployeeByID(@PathVariable int id){
        Employee employee;
        employee = employeeService.getEmployeeById(id);
        return employee;
    }

    @GetMapping("/employee/sorted/name")
    public List<Object[]> displayNameAfterSorting(){
        return employeeService.displayNameSorted();
    }

    @Transactional
    @PutMapping("/employee/salary/{newSalary}")
    public String updateSalaryHavingMinSalary( @PathVariable int newSalary){
        employeeService.updateMinSalary(newSalary);
        return "Operation Successful.";
    }

    @Transactional
    @DeleteMapping("/employee/delete/salary/min/{minSalary}")
    public String deleteWithMinSalary(@PathVariable int minSalary){
        employeeService.deleteMinSalary(minSalary);
        return "Operation Successful.";
    }

    @GetMapping("/employee/lastname")
    public List<Object[]> findByLastName(){
        return employeeService.findByLastName();
    }
    @Transactional
    @DeleteMapping("/employee/delete/age/max/{maxAge}")
    public String deleteEmpOnAge(@PathVariable int maxAge){
        employeeService.deleteEmployeeOnAge(maxAge);
        return "Operation Successful.";
    }
}
