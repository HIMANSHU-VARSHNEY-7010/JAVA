package com.SpringDataJPAwithHibernatePart2.SpringDataJPAwithHibernatePart2.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id ;
    @Column(name = "emp_firstname")
    private String firstName ;
    @Column(name = "emp_lastname")
    private String lastName ;
    @Column(name = "emp_salary")
    private int salary ;
    @Embedded
    private Salary salaryStructure;
    @Column(name = "emp_age")
    private  int age ;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary, Salary salaryStructure, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryStructure = salaryStructure;
        this.age = age;
    }

    public void setSalaryStructure(Salary salaryStructure) {
        this.salaryStructure = salaryStructure;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalaryStructure() {
        return salaryStructure;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", salaryStructure=" + salaryStructure +
                ", age=" + age +
                '}';
    }
}
