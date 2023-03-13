package QUES_4;

import java.util.stream.Stream;

//      4. Use iterator stream method to generate a stream
public class QUES_4 {
    public static void main(String[] args) {
        System.out.println("Stream generated with iterate method :-");
        Stream<Integer> genStream = Stream.iterate(1, i -> i < 6 , i->i+1);
          genStream.forEach(System.out::println);
    }
}
