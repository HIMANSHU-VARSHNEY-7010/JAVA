package QUES_4;
//    4) Create class Employee with attributes name,age,designation and use instances of these class as keys
//          in a Map and their salary as value.
import java.util.HashMap;
import java.util.Map;

public class QUES_4 {
    public static void main(String[] args) {
        HashMap<Employee,Integer> map=new HashMap<>();
        map.put(new Employee("Himanshu",23,"Trainee"),100000);
        map.put(new Employee("Devansh",21,"Trainee"),50000);
        map.put(new Employee("Inder",22,"Trainee"),60000);
        for(Map.Entry<Employee,Integer> mp:map.entrySet()){
            System.out.println(mp.getKey() +" | Salary :"+mp.getValue());
        }
    }
}
