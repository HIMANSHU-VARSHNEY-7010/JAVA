package QUES_2;
//      2) Given the following class
//          Employee class{ Double Age; Double Salary; String Name}
//          Design the class in such a way that the default sorting should work on firstname and lastname.
//          Also, Write a program to sort Employee objects based on salary using Comparator.
import java.util.ArrayList;
import java.util.Collections;

public class QUES_2 {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Himanshu",23,160000));
        emp.add(new Employee("Kunal",23,35000));
        emp.add(new Employee("Amartya",23,80000));
        emp.add(new Employee("Archit",22,60000));
        System.out.println("Sorting according to Name :-");
        Collections.sort(emp);
        for(Employee e:emp){
            e.showDetails();
        }
        System.out.println("\nSorting according to Salary :-");
        Collections.sort(emp,new SortBySalary());
        for(Employee e:emp){
            e.showDetails();
        }
    }
}
