package com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Controller;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.DTO.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Service.impl.ServiceIMPL;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.UserV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// Create API which saves details of User (along with the password)
// but on successfully saving returns only non-critical data
@RestController

public class Controller {
@Autowired
    public ServiceIMPL service ;


 @GetMapping("/users")
 public List<User> getAllUsers(){
     return service.getAllUsersData();
 }


 // URI versioningvv
 @GetMapping("/users/v2")
    public List<UserV2> getAllUsersv2(){
        return service.getAllUsersDataV2();
    }


    // Versioning By Params   Like http://localhost:8080/user?version=2
    @GetMapping(path = "user" , params = "version=2")
    public List<UserV2> getAllUsersv2usingVersioninig(){
        return service.getAllUsersDataV2();
    }



    @GetMapping(path = "user" , headers = "X-API-VERSION=2")
    public List<UserV2> getAllUsersv2Header(){
        return service.getAllUsersDataV2();
    }


    // Using Dynamic fltering vv see in  ServiceIML AND @JsonFiltering()  in User
//    @GetMapping("/users2")
//    public MappingJacksonValue getAllUser(){
//
////        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(User) ;
//
////        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("password");
////        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
////        mappingJacksonValue.setFilters(filters);
//
//        return service.dynamicFiltering() ;
//    }

    @PostMapping("/user")
    public void postUser(@RequestBody UserDTO userBody){

        service.postUser(userBody) ;

    }

    @PostMapping("/user/v2")
    public UserV2 postUser(@RequestBody UserV2 userBody){


        System.out.println(userBody.getPassword());
      return service.postUserV2(userBody) ;

    }
}
