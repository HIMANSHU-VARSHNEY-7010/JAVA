package QUES_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Q5. Given a list of objects of following class:
//      class Employee{
//      String fullName;
//      Long salary;
//      String city;
//      }
//      Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//      Note: Full name is concatenation of first name, middle name and last name with single space in between.
class Employee{
    String fullName;
    Long Salary;
    String City;

    public Employee(String fullName, Long Salary, String City) {
        this.fullName = fullName;
        this.Salary = Salary;
        this.City = City;
    }
}
public class QUES_5 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Himanshu Varshney", 500000L, "Delhi"));
        employeeList.add(new Employee("Kunal Jaiswal", 2000L, "Patna"));
        employeeList.add(new Employee("Sakshi Kashyap", 4500L, "Delhi"));
        employeeList.add(new Employee("Harsh Vardhan Singh", 4000L, "Delhi"));
        employeeList.add(new Employee("Sakshi Gupta", 2700L, "Delhi"));

        System.out.println(
                employeeList.stream()
                        .filter(e -> e.Salary < 5000)
                        .filter(e -> e.City.equalsIgnoreCase("Delhi"))
                        .map(e -> e.fullName.toString())
                        .map(e -> e.substring(0,e.indexOf(" ")))
                        .distinct()
                        .collect(Collectors.toList())
//                      .collect(Collectors.toSet())
//                        .forEach(System.out::println);

        );
    }
}
