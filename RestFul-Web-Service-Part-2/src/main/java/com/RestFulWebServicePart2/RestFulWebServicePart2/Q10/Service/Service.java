package com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.Service;



import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.DTO.UserDTO;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.User;
import com.RestFulWebServicePart2.RestFulWebServicePart2.Q10.UserV2;

import java.util.List;

public interface Service {
     List<User> getAllUsersData() ;


    List<UserV2> getAllUsersDataV2();

    User postUser(UserDTO userBody);
    UserV2 postUserV2(UserV2 userBody);
}
