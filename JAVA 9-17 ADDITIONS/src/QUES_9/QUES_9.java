package QUES_9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//      9. Create Unmodifiable List from a Stream
public class QUES_9 {
    public static void main(String[] args) {
        List<Integer> unmodifiableIntegerList = Stream.of(1,2,3,4,5,6,7,8,9)
                                                      .filter(e -> e%2==0)
                                                      .collect(Collectors.toUnmodifiableList());
        try {
            unmodifiableIntegerList.add(5);
        }catch (Exception ex){
            System.out.println("Fifth element can not be added to the Unmodifiable List.");
        }finally {
            System.out.println("Elements in Unmodifiable List :-\n" + unmodifiableIntegerList);
        }
    }
}
