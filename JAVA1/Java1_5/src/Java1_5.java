import java.util.Scanner;
public class Java1_5 {
    public static void main(String[] args) {
        System.out.println("Enter the Details");
        Scanner scn = new Scanner(System.in);
        employee emp = new employee();
        System.out.println("Enter the First Name : ");
        emp.setFirstName(scn.nextLine());
        System.out.println("Enter the Last Name : ");
        emp.setLastName(scn.nextLine());
        System.out.println("Enter the Age : ");
        emp.setAge(scn.nextLine());
        System.out.println("Enter the Designation : ");
        emp.setDesignation(scn.nextLine());
        System.out.println(" = " + emp);
    }
}