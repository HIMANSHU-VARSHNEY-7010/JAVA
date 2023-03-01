//3. Write a java program to show following menu to the user:
//   *******Menu*******
//   1. Calculate Area of Circle
//   2. Calculate Circumference of a Circle
//   3. Exit.
//   Choose an option (1-3):
//   Take radius as user input.
//
//   Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
package JAVA_1;

import java.util.Scanner;
import java.lang.Math;

public class Java1_3 {
    public static double circumference (double radius){
        return 2*Math.PI*radius;
    }
    public static double area (double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        double radii = 0;
        int option = -1;
        do{
            System.out.print("MENU :- ");
            System.out.print("\n1. Calculate Area of Circle");
            System.out.print("\n2. Calculate Circumference of a Circle");
            System.out.print("\n3. Exit");
            System.out.print("\nChoose an option (1-3) : ");
            option = scn.nextInt();
            switch (option){
                case 1 : System.out.println("\nEnter the radius of the circle : ");
                         radii = scn.nextFloat();
                         System.out.println("Area of the Circle : \n" + area(radii) + "\n");
                         break;
                case 2 : System.out.println("\nEnter the radius of the circle : ");
                         radii = scn.nextFloat();
                         System.out.println("Area of the Circle : \n" + circumference(radii) + "\n");
                         break;
                case 3 : break;
                default: System.out.println("Enter a valid option.\n\n");
                         break;
            }
        }while(option != 3);
    }

}
