package com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Entity;

import jakarta.persistence.*;
//		(1) Create an Employee Entity which contains following fields
//			Id
//			Name
//			Age
//			Location
@Entity
public class Employee {
    @Id
    private int empID;
    private String empName;
    private int empAge;
    private String empLocation;
    public Employee() {
    }
    public Employee(int empID, String empName, int empAge, String empLocation) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empLocation = empLocation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + empID +
                ", employeeName='" + empName + '\'' +
                ", employeeAge=" + empAge +
                ", employeeLocation='" + empLocation + '\'' +
                '}';
    }
}
