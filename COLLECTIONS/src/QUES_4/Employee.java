package QUES_4;

import java.util.Objects;

public class Employee {
    private String name,designation;
    private int age;
    Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;

    }
    public int hashCode() {
        return Objects.hash(this.name , this.designation , this.age) ;
    }
    @Override
    public boolean equals(Object obj) {

        Employee e = (Employee) obj ;

        return e.name.equals(this.name) && e.designation.equals(this.designation) && e.age == this.age;

    }
    public String toString(){
        return "Name: "+name+" | Age:"+age+" | Designation: "+designation;
    }

}

