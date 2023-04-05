package com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Service;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Name;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV1;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceIMPL implements UsersService {

    private static List<UserV1> usersList1 = new ArrayList<>();
    private static List<UserV2> usersList2 = new ArrayList<>();
static {
usersList1.add(new UserV1(1,"Himanshu Varshney","himanshu@gmail.com", "abc123"));
usersList2.add(new UserV2(1,new Name("Himanshu","Varshney"),"himanshu@gmail.com", "xyz789"));
}
    @Override
    public List<UserV1> getAllUsersDataV1() {
        return usersList1;
    }
    @Override
    public List<UserV2> getAllUsersDataV2() {
        return usersList2;
    }
    @Override
    public UserV1 postUserV1(UserDTO userBody){
        UserV1 sUser = new UserV1() ;
        sUser.setUserName(userBody.getUserName());
        sUser.setUserID(userBody.getUserID());
        sUser.setUserEmail(userBody.getUserEmail()) ;
        sUser.setUserPassword(userBody.getUserPassword());
        usersList1.add(sUser) ;
        System.out.println(usersList1);
        return sUser ;
    }
    @Override
    public UserV2 postUserV2(UserV2 userBody) {
        usersList2.add(userBody);
        return userBody;
    }
}
