package QUES_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//      6. Convert an Optional type into Stream
public class QUES_6 {
    public static void main(String[] args) {
        List<Integer> iL = Arrays.asList(1,2,3,4,5,6,7,9,8);
        iL.stream()
                .filter(e->e>8).findFirst()
                .stream()
                .mapMulti((number,consumer) -> IntStream.rangeClosed(1,10)
                .forEach(e -> consumer.accept(e*number)))
                .forEach(System.out::println);
    }
}
