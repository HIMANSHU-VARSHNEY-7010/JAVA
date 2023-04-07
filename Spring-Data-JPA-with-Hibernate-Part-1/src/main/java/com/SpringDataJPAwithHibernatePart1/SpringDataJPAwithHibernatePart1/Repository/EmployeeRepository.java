package com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Repository;

import com.SpringDataJPAwithHibernatePart1.SpringDataJPAwithHibernatePart1.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//		(2) Set up EmployeeRepository with Spring Data JPA
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>,
        PagingAndSortingRepository<Employee,Integer> {

    List<Employee> findByEmpName(String empName);
    List<Employee> findByEmpNameStartsWith(char character);
    List<Employee> findByEmpAgeBetween(int empAge1,int empAge2);

}
