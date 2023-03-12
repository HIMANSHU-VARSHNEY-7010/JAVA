package QUES_12;

import java.util.Scanner;

//      12. Demonstrate the use of Sealed Classes.
public class QUES_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        Circle circle = new Circle(scn.nextFloat());
        System.out.print("Enter the side of the Square : ");
        Square square = new Square(scn.nextFloat());
        System.out.println("Area of Circle is : " + circle.area());
        System.out.println("Area of Square is : " + square.area());
    }
}
