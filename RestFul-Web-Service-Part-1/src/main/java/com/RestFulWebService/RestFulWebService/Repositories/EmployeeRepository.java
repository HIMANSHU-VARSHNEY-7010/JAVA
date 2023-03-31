package com.RestFulWebService.RestFulWebService.Repositories;

import com.RestFulWebService.RestFulWebService.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
