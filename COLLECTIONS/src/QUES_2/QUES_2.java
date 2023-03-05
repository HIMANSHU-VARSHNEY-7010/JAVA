package QUES_2;
//      2) Given the following class
//          Employee class{ Double Age; Double Salary; String Name}
//          Design the class in such a way that the default sorting should work on firstname and lastname.
//          Also, Write a program to sort Employee objects based on salary using Comparator.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QUES_2 {
    public static void main(String[] args) {
        ArrayList<EmployeeClass> emp=new ArrayList<>();
        emp.add(new EmployeeClass("Himanshu",23,160000));
        emp.add(new EmployeeClass("Kunal",23,35000));
        emp.add(new EmployeeClass("Amartya",23,80000));
        emp.add(new EmployeeClass("Archit",22,60000));
        System.out.println("Sorting according to Name :-");
        Collections.sort(emp);
        for(EmployeeClass e:emp){
            e.showDetails();
        }
        System.out.println("\nSorting according to Salary :-");
        Collections.sort(emp,new SortBySalary());
        for(EmployeeClass e:emp){
            e.showDetails();
        }
    }
}
