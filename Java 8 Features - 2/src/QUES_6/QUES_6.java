package QUES_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//      Q6. Using java 8 date/time api:
//        # WAP to get two dates from user and print if the first date occurs before or after the second date
//          supplied by the user.
//        # WAP to print current date and time in 3 different time zones.
public class QUES_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD) : ");
        String d1 = scn.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD) : ");
        String d2 = scn.nextLine();
        try{
            LocalDate date1 = LocalDate.parse(d1);
            LocalDate date2 = LocalDate.parse(d2);
            boolean isBefore = date1.isBefore(date2);
            boolean isAfter = date1.isAfter(date2);
            boolean isEqual = date1.isEqual(date2);
            if(isAfter){
                System.out.println("The first date " + d1 + " is after the second date " + d2 + ".");
            }else if(isBefore){
                System.out.println("The first date " + d1 + " is before the second date " + d2 + ".");
            }else if(isEqual){
                System.out.println("The first date " + d1 + " is equals to the second date " + d2 + ".");
            }else {
                System.out.println("Enter a Valid Date.");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        System.out.println("Date and time in Madrid: " + df.format(date));

        df.setTimeZone(TimeZone.getTimeZone("America/Denver"));
        System.out.println("Date and time in Denver: " + df.format(date));

        df.setTimeZone(TimeZone.getDefault());
        System.out.println("Date and time in India: " + df.format(date));
    }
}