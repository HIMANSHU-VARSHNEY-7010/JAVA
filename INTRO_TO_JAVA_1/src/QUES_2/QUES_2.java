package QUES_2;
//  Q2) Write a program to read user input until user writes XDONE and then
//      show the entered text by the user on commandline
import java.util.*;
public class QUES_2 {
    public static void main(String[] args) {
        System.out.println("Enter the Strings :- ");
        List<String> str = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while(true){
            String strng = scn.nextLine();
            if(strng.equalsIgnoreCase("XDONE")){
                break;
            }
            str.add(strng);
        }
        System.out.println("Text Entered :- ");
        for(String strng : str){
            System.out.println(strng);
        }
    }
}