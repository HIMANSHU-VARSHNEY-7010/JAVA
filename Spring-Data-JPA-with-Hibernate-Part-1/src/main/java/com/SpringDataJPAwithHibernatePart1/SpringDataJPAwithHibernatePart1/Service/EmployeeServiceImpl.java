package com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Service;

import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Entity.Employee;
import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Exception.EmployeeNotFoundException;
import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

//	(3) Perform Create Operation on Entity using Spring Data JPA
    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Employee details added to employee table in the Database.";
    }

//  (4) Perform Update Operation on Entity using Spring Data JPA
    public String updateEmployee(int empID,Employee employee){
        Employee emp = getEmployeeByID(empID);
        emp.setEmpName(employee.getEmpName());
        emp.setEmpAge(employee.getEmpAge());
        emp.setEmpLocation(employee.getEmpLocation());
        employeeRepository.save(emp);
        return "Employee details updated in employee table in the Database.";
    }

//	(5) Perform Delete Operation on Entity using Spring Data JPA
    public String deleteEmployee(int empID){
        List<Employee> employeeList = getEmployee();
        Employee employee = employeeList.stream()
                .filter(e -> Objects.equals(e.getEmpID(), empID))
                .findFirst().orElse(null);
        if (employee == null) throw new EmployeeNotFoundException("Employee with empId: " + empID + " not Found.");
        else employeeRepository.deleteById(empID);
        return "Employee details deleted from employee table in the Database.";
    }

//	(5) Perform Read Operation on Entity using Spring Data JPA
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeByID(int empID) {
        List<Employee> employeeList = getEmployee();
        Employee employee = employeeList.stream()
                .filter(e -> Objects.equals(e.getEmpID(), empID))
                .findFirst().orElse(null);
        if (employee == null) throw new EmployeeNotFoundException("Employee with empId: " + empID + " not Found.");
        else return employee;
    }

//  (6) Get the total count of the number of Employees
    public long employeeCount(){
        return employeeRepository.count();
    }

//	(7) Implement Pagination and Sorting on the bases of Employee Age
    public Page<Employee> pagingAndSortingByEmpAge(int pageNo){
        Pageable pageable = PageRequest.of(pageNo,2, Sort.Direction.ASC, "empAge");
        return employeeRepository.findAll(pageable);
    }

//	(8) Create and use finder to find Employee by Name
    public List<Employee> findByName(String empName){
        List<Employee> employeeList;
        employeeList = employeeRepository.findByEmpName(empName);
        return employeeList;
    }

//	(9) Create and use finder to find Employees starting with A character
    public List<Employee> findEmpNameStartsWith(char character){
        List<Employee> employeeList;
        employeeList = employeeRepository.findByEmpNameStartsWith(character);
        return employeeList;
    }

//	(10) Create and use finder to find Employees Between the age of 28 to 32
    public List<Employee> retrieveAge(int empAge1,int empAge2){
        List<Employee> employeeList;
        employeeList = employeeRepository.findByEmpAgeBetween(empAge1, empAge2);
        return employeeList;
    }
}
