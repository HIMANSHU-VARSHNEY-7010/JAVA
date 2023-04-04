package com.RestFulWebServicePart2.RestFulWebServicePart2.Entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import jakarta.persistence.*;

@Entity
@Table(name = "UsersDTO")
@JsonFilter("SomeBeanFilter")
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;
    private String userName;
    private String userEmail;
    private String userPassword;

    public UserDTO() {
    }
    public UserDTO(String userName, String userEmail, String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public UserDTO(Integer empID, String empName, String userEmail, String userPassword) {
        this.userID = empID;
        this.userName = empName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + userID +
                ", UserName='" + userName + '\'' +
                ", UserEmail='" + userEmail + '\'' +
                ", UserPassword='" + userPassword + '\'' +
                '}';
    }

}
