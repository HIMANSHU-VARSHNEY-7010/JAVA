package com.RestFulWebServicePart2.RestFulWebServicePart2.Repositories;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
