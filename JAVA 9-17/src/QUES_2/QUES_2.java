package QUES_2;

import java.util.Arrays;
import java.util.List;

//      2. Perform takeWhile and dropWhile operations on stream
public class QUES_2 {
    public static void main(String[] args) {
        List<Integer> iL = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Output Using takeWhile() :-");
        iL.stream()
          .takeWhile(e -> e<5)
          .forEach(System.out::println);
        System.out.println("Output Using dropWhile() :-");
        iL.stream()
          .dropWhile(e -> e<5)
          .forEach(System.out::println);
    }
}
