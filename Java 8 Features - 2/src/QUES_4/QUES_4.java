package QUES_4;

import java.util.Optional;

//      Q4. Write a program to showcase the use of optional class
public class QUES_4 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println((String)opt.orElse("Contains Null "));
    }
}