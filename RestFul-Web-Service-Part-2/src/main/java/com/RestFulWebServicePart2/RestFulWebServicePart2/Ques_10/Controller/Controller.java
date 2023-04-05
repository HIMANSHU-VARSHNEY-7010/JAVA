package com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Controller;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Service.ServiceIMPL;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV1;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    public ServiceIMPL service ;

    // URI Versioning
    @GetMapping("/user/v1")
    public List<UserV1> getAllUsers(){
        return service.getAllUsersDataV1();
    }
    @GetMapping("/user/v2")
    public List<UserV2> getAllUsersV2(){
        return service.getAllUsersDataV2();
    }
    // Request Parameter Versioning   Like http://localhost:8075/user?version=1
    @GetMapping(path = "/user" , params = "version=1")
    public List<UserV1> getAllUsersV1usingParams(){
        return service.getAllUsersDataV1();
    }
    // Request Parameter Versioning   Like http://localhost:8075/user?version=2
    @GetMapping(path = "/user" , params = "version=2")
    public List<UserV2> getAllUsersV2usingParams(){
        return service.getAllUsersDataV2();
    }
    // Custom Header Versioning
    @GetMapping(path = "/user" , headers = "X-API-VERSION=1")
    public List<UserV1> getAllUsersV1Header(){
        return service.getAllUsersDataV1();
    }
    @GetMapping(path = "/user" , headers = "X-API-VERSION=2")
    public List<UserV2> getAllUsersV2Header(){
        return service.getAllUsersDataV2();
    }
    // MimeType Versioning
    @GetMapping(path = "/user" , produces = "application/vnd.company.app-v1+json")
    public List<UserV1> getAllUsersV1Media(){
        return service.getAllUsersDataV1();
    }
    @GetMapping(path = "/user" , produces = "application/vnd.company.app-v2+json")
    public List<UserV2> getAllUsersV2Media(){
        return service.getAllUsersDataV2();
    }
    @PostMapping("/user/v1")
    public UserV1 postUser(@RequestBody UserDTO userBody){
        return service.postUserV1(userBody);
    }
    @PostMapping("/user/v2")
    public UserV2 postUser(@RequestBody UserV2 userBody){
        return service.postUserV2(userBody) ;
    }
}
