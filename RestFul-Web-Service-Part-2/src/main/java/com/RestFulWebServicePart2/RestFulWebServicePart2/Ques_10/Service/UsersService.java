package com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Service;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV1;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity.UserV2;

import java.util.List;

public interface UsersService {
    List<UserV1> getAllUsersDataV1() ;
    List<UserV2> getAllUsersDataV2();
    UserV1 postUserV1(UserDTO userBody);
    UserV2 postUserV2(UserV2 userBody);
}
