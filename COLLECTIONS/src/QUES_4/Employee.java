package QUES_4;

public class Employee {
    private String name,designation;
    private int age;
    Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;

    }
    public String toString(){
        return "Name: "+name+" | Age:"+age+" | Designation: "+designation;
    }

}

