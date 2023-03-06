package QUES_5;
//    5) Write a program to show application of Singleton Design Pattern.
import java.io.File;
import java.util.Scanner;
public class QUES_5 {
    public static void main(String[] args){
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

            User getDetails = User.getInstance(FirstName , LastName , age , phoneNo) ;
            System.out.println(getDetails.showDetails());

            System.out.println("Do you want to continue creating users? (Type QUIT to exit):");
            String quit = scn.nextLine();
            if(quit.equalsIgnoreCase("QUIT")){
                flag = false;
            }

        }while(flag);
    }
}
