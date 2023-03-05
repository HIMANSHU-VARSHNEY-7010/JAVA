package QUES_4;
//    4) Create class Employee with attributes name,age,designation and use instances of these class as keys
//          in a Map and their salary as value.
import java.util.HashMap;
import java.util.Map;

public class QUES_4 {
    public static void main(String[] args) {
        HashMap<Employee,Integer> map=new HashMap<>();
        map.put(new Employee("Nitin",22,"Trainee"),200110);
        map.put(new Employee("Pranshu",22,"Trainee"),29200);
        map.put(new Employee("Meher",22,"Trainee"),200100);
        for(Map.Entry<Employee,Integer> mp:map.entrySet()){
            System.out.println(mp.getKey() +"|Salary :"+mp.getValue());
        }
    }
}
