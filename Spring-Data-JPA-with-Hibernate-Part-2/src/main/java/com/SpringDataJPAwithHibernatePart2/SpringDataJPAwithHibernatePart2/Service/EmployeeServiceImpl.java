package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Service;

import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity.Employee;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Exception.EmployeeAlreadyExistException;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Exception.EmployeeNotFoundException;
import com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    public String addEmployee(Employee employee){
        if(getEmpById(employee.getId())!=null)
            throw new EmployeeAlreadyExistException("Employee with id: " + employee.getId() + " already exist.");
        else employeeRepository.save(employee);
        return "Employee details added to employee table in the Database.";
    }

    public String updateEmployee(int id,Employee employee){
        Employee emp = getEmployeeById(id);
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setSalary(employee.getSalary());
        emp.setAge(employee.getAge());
        employeeRepository.save(emp);
        return "Employee details updated in employee table in the Database.";
    }

    public String deleteEmployee(int id){
        List<Employee> employeeList = getEmployee();
        Employee employee = employeeList.stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .findFirst().orElse(null);
        if (employee == null) throw new EmployeeNotFoundException("Employee with id: " + id + " not Found.");
        else employeeRepository.deleteById(id);
        return "Employee details deleted from employee table in the Database.";
    }

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int id) {
        List<Employee> employeeList = getEmployee();
        Employee employee = employeeList.stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .findFirst().orElse(null);
        if (employee == null) throw new EmployeeNotFoundException("Employee with id: " + id + " not Found.");
        else return employee;
    }
    public Employee getEmpById(int id) {
        List<Employee> employeeList = getEmployee();
        Employee employee = employeeList.stream()
                .filter(e -> Objects.equals(e.getId(), id))
                .findFirst().orElse(null);
        return employee;
    }
    public List<Object[]> displayNameSorted(){
        return employeeRepository.displayName();
    }

    public void updateMinSalary(int newSalary){
        int avg = employeeRepository.avgSalary();
        employeeRepository.updateSal(newSalary,avg);
    }

    public void deleteMinSalary(int minSalary){
        employeeRepository.deleteWithMinSal(minSalary);
    }

    public List<Object[]> findByLastName(){
        return employeeRepository.findLastName();
    }

    public void deleteEmployeeOnAge(int maxAge){
        employeeRepository.deleteEmpOnAge(maxAge);
    }

}
