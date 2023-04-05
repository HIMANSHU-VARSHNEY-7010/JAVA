package com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity;

import com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Name;

public class UserV2 {
    private int userID;
    private Name userName;
    private String userEmail;
    private String userPassword;

    public UserV2(int userID, Name userName, String userEmail, String userPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Name getUserName() {
        return userName;
    }

    public void setUserName(Name userName) {
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
        return "UserV2{" +
                "userID=" + userID +
                ", userName=" + userName +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
