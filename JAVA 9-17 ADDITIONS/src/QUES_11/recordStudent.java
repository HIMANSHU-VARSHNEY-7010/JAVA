package QUES_11;

import java.util.Objects;

public record recordStudent(String name , int id , int age) {
    public static int count = 0 ;

    public recordStudent{
        count ++ ;
    }

//   #ERROR: Cannot assign a value to final variable 'age'
//    public void ageChange(int age) {
//        this.age = age;
//    }

    @Override
    public int hashCode(){

        return Objects.hash(this.name , this.age , this.id) ;

    }


    @Override
    public boolean equals(Object obj){

        recordStudent r = (recordStudent) obj ;
        return this.id == r.id && this.age == r.age && this.name.equals(r.name) ;

    }

}

