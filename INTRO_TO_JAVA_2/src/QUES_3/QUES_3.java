package QUES_3;
//Q3 WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
import java.lang.Exception;
public class QUES_3 {
    public static void main(String[] args){
        try{
            Class.forName("ClassNotExist");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (NoClassDefFoundError exp){
            System.out.println(exp);
        }
    }
}