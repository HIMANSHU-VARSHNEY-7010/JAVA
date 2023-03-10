package QUES_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//      8. Demonstrate the use AutoCloseable
public class QUES_8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in) ;

        File file = new File("Details.txt");

            System.out.print("Enter the String you want to store to the File : ");
            String string = scn.nextLine();

            try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){ //
                br.write(string);
                br.newLine();
            }catch (IOException e){
                System.out.println("Unable To Read File");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

    }
}
