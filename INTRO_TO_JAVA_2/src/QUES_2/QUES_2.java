package QUES_2;

// Q2 WAP showing try, multi-catch and finally blocks.

public class QUES_2 {
    public static void main(String[] args) {
        int y = 7 ;
        try{
            int x = y / 0 ;
        }catch (ArithmeticException e){
            System.out.println("Divide by Zero Not Possible.");
        }catch(Exception e){
            System.out.println("Runtime Exception handled.");
        }finally{
            System.out.println("Finally block displayed.");
        }

        System.out.println("This statement will be executed also.") ;


    }
}