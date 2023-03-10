package QUES_3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//      3. Use rangeClosed to create a  Stream
public class QUES_3 {
    public static void main(String[] args) {
        IntStream integerStream = IntStream.rangeClosed(1,7);
        System.out.println("Integer Stream contains :-");
        integerStream.forEach(System.out::println);
    }
}
