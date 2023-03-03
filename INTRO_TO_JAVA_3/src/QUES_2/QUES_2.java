package QUES_2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//) Create a User class with fields:  firstname, lastname, age, phonenumber.
// Write a program which accepts values of user fields from commandline,
// create object and append that to a text file.
// After every user creation the program should prompt: "Do you want to continue creating users?
// (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.
public class QUES_2 {
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner scn = new Scanner(System.in) ;

        File file = new File("Details.txt");

        ;
        // File Writer can take 2 parameters 1st is File argument 2nd is true which append true or false
        Boolean flag = true;
        do{
//            System.out.println("Enter Id ");
//            int id = scn.nextInt() ;

            System.out.println("Please enter the details :-");

            System.out.println("Enter the FirstName: ");
            String FirstName = scn.nextLine() ;

            System.out.println("Enter the LastName: ") ;
            String LastName = scn.nextLine() ;

            System.out.println("Enter the Age: ") ;
            String age = scn.nextLine() ;

            System.out.println("Enter The Phone Number: ");
            String phoneNo = scn.nextLine() ;

            SingletonClass getDetails = SingletonClass.getInstance(FirstName , LastName , age , phoneNo) ;
            System.out.println(getDetails.showDetails());

            System.out.println("Do you want to continue creating users? (Type QUIT to exit):");
            String strng = scn.nextLine();
            if(strng.equalsIgnoreCase("QUIT")){
                flag = false;
            }

            try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){ //
                br.write(getDetails.showDetails());
                br.newLine();


            }catch (IOException e){
                System.out.println("Unable To Read File");
            }

        }while(flag);
    }
}