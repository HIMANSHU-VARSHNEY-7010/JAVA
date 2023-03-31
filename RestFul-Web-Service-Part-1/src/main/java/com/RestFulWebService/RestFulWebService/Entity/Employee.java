package com.RestFulWebService.RestFulWebService.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empID;
    @Size(min=3, message = "Name should be more than 2 characters.")
    private String empName;
    @Min(value=18, message = "Age should be greater than 18 years.")
    private Integer empAge;

    public Employee() {
    }
    public Employee(String empName, Integer empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }

    public Employee(Integer empID, String empName, Integer empAge) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                '}';
    }
}
