package com.RestFulWebServicePart2.RestFulWebServicePart2.Service;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Entity.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Exception.UserNotFoundException;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Repositories.UserRepository;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserID(userDTO.getUserID());
        user.setUserName(userDTO.getUserName());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserPassword(userDTO.getUserPassword());
        System.out.println(user.getUserPassword());
        return userRepository.save(user);
    }
    @Override
    public User findUser(Integer userId){
        List<User> userList = userRepository.findAll();
        User user = userList.stream()
                            .filter(e -> Objects.equals(e.getUserID(), userId))
                            .findFirst().orElse(null);
        if(user==null) throw new UserNotFoundException("User with userId: " + userId + " not Found.");
        else return user;
    }
    @Override
    public void deleteUser(Integer userId){
        User user = findUser(userId);
        if(user==null) throw new UserNotFoundException("User with userId: " + userId + " not Found.");
        userRepository.deleteById(userId);
        System.out.println("User Deleted Successfully.");
    }
    public MappingJacksonValue dynamicFiltering(){
                  MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(findAll()) ;

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("userId",
                                                                                    "userName","userEmail");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
