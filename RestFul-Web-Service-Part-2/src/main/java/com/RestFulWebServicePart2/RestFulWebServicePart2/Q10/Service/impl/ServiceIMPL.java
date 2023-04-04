package com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Service.impl;


import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.DTO.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Name;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Service.Service;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.UserV2;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ServiceIMPL implements Service {

    private static List<User> usersList = new ArrayList<>();
    private static List<UserV2> usersList2 = new ArrayList<>();
    static {

        usersList.add(new User(1,"ips@ii.com","Ips Singh", "qwertyuiop"));
        usersList2.add(new UserV2(1,"ips@ii.com",new Name("Ips","Singh"), "qwertyuiop"));


    }


    @Override
    public List<User> getAllUsersData() {
        return usersList;
    }

    @Override
    public List<UserV2> getAllUsersDataV2() {
        return usersList2;
    }



    @Override
    public User postUser(UserDTO userBody){
        User sUser = new User() ;
        sUser.setName(userBody.getName());
        sUser.setId(userBody.getId());
        sUser.setEmail(userBody.getEmail()) ;
        sUser.setPassword(userBody.getPassword());

        usersList.add(sUser) ;
        System.out.println(usersList);
        return sUser ;
    }

    @Override
    public UserV2 postUserV2(UserV2 userBody) {
        usersList2.add(userBody);
        return userBody;
    }

//    public MappingJacksonValue dynamicFiltering(){
//        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(usersList) ;
//
//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id" , "email" , "name");
//        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
//        mappingJacksonValue.setFilters(filters);
//
//        return mappingJacksonValue;
//    }
}
