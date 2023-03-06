package QUES_5;

public class User {
    private static User obj ;
    private  String  FirstName ;
    private String LastName ;
    private String age ;

    private String phoneNo ;

    private User(String FirstName , String LastName , String age , String phoneNo){

        this.FirstName  = FirstName ;
        this.LastName = LastName ;
        this.age = age ;
        this.phoneNo = phoneNo ;
    }

    public static User getInstance(String FirstName , String LastName , String age , String phoneNo){
        if(obj == null){
            obj = new User(FirstName , LastName , age , phoneNo) ;
        }
        else{
            obj.FirstName  = FirstName ;
            obj.LastName = LastName ;
            obj.age = age ;
            obj.phoneNo = phoneNo ;

        }
        return obj ;
    }

    public String showDetails(){
        return ("First Name: " + this.FirstName + ", Last Name: " + this.LastName + ", Age: " + this.age +
                ", Phone No.: " + this.phoneNo);
    }

}

