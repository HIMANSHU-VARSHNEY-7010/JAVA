package QUES_3;

import java.util.ArrayList;
import java.util.List;

//      Q3. Sum all the numbers greater than 5 in the integer list using streams
public class QUES_3 {
     public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(3);
        System.out.println("Sum of numbers (num>5) : " +
                list.stream()
                    .filter(e -> e > 5)
                    .reduce(0, Integer::sum));
    }
}
