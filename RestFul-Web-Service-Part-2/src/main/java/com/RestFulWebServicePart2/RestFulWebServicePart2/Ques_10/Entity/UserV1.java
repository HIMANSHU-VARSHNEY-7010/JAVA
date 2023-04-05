package com.RestFulWebServicePart2.RestFulWebServicePart2.Ques_10.Entity;

public class UserV1 {
    private int userID;
    private String userName;
    private String userEmail;
    private String userPassword;
    public UserV1() {
    }

    public UserV1(int id, String name, String email, String password) {
        this.userID = id;
        this.userName = name;
        this.userEmail = email;
        this.userPassword = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
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
        return "UserV1{" +
                "id=" + userID +
                ", name='" + userName + '\'' +
                ", email='" + userEmail + '\'' +
                ", password='" + userPassword + '\'' +
                '}';
    }
}
