package QUES_1;
//  Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName &
//      age using static block, static method & static variable respectively.
public class QUES_1 {
    static{
        System.out.println("Hi! This is Static Information.");
    }
    public static void main(String[] args) {

        Information info = new Information();
        info.printInfo();
        Information.printInfo();
    }
}
