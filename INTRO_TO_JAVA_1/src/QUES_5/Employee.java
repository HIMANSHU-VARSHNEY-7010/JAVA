package QUES_5;

public class Employee {
    public String firstName ;
    public String lastName ;
    public String age ;
    public String designation ;

    Employee(){
        this.firstName="" ;
        this.lastName="" ;
        this.age="";
        this.designation="" ;
    }

    Employee(String firstName , String lastName , String age , String designation){
        this.firstName=firstName ;
        this.lastName=lastName ;
        this.age=age;
        this.designation=designation ;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }
    public String toString(){
        return firstName +" "+lastName +" is "+age + " years old and working as "+designation ;
    }
}
