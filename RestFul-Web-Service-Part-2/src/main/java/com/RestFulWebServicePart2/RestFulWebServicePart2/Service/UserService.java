package com.RestFulWebServicePart2.RestFulWebServicePart2.Service;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.UserDTO;
import org.springframework.http.converter.json.MappingJacksonValue;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User createUserDTO(UserDTO userDTO);
    public String createUser(User user);
    public User findUser(Integer userId);
    public void deleteUser(Integer userId);
    public MappingJacksonValue dynamicFiltering();
}
