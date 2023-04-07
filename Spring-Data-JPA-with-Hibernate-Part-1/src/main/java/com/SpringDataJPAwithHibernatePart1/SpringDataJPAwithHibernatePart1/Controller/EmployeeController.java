package com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Controller;

import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Entity.Employee;
import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @PutMapping("/employee/{empID}")
    public String updateEmployeeByID(@PathVariable int empID,@RequestBody Employee employee){
        String result;
        result = employeeService.updateEmployee(empID, employee);
        return result;
    }

    @DeleteMapping("/employee/{empID}")
    public String deleteEmployeeByID(@PathVariable int empID){
        String result;
        result = employeeService.deleteEmployee(empID);
        return result;
    }


    @GetMapping("/employee")
    public List<Employee> findAllEmployee(){
        List<Employee> employeeList;
        employeeList = employeeService.getEmployee();
        return employeeList;
    }

    @GetMapping("/employee/{empID}")
    public Employee findEmployeeByID(@PathVariable int empID){
        Employee employee;
        employee = employeeService.getEmployeeByID(empID);
        return employee;
    }

    @GetMapping("/employee/count")
    public long countEmployees(){
        long noOfEmployees;
        noOfEmployees = employeeService.employeeCount();
        return noOfEmployees;
    }
    @GetMapping("/employee/page/{pageNo}")
    public Page<Employee> pagingAndSortingByEmployeeAge(@PathVariable int pageNo){
        Page<Employee> employeePage;
        employeePage = employeeService.pagingAndSortingByEmpAge(pageNo);
        return employeePage;
    }
    @GetMapping("/employee/name/{empName}")
    public List<Employee> findName(@PathVariable String empName){
        List<Employee> employeeList;
        employeeList = employeeService.findByName(empName);
        return employeeList;
    }

    @GetMapping("/employee/char/{character}")
    public List<Employee> findStartingChar(@PathVariable char character){
        List<Employee> employeeList;
        employeeList = employeeService.findEmpNameStartsWith(character);
        return employeeList;
    }

    @GetMapping("/employee/age_between/{empAge1}/{empAge2}")
    public List<Employee> retrieveAgeData(@PathVariable int empAge1,@PathVariable int empAge2){
        List<Employee> employeeList;
        employeeList = employeeService.retrieveAge(empAge1,empAge2);
        return employeeList;
    }

}
