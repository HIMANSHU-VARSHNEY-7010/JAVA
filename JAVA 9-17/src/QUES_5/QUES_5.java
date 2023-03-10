package QUES_5;

import java.util.Arrays;
import java.util.List;
import java.lang.Exception;
import java.util.Optional;

//      5. Use ifPresentOrElse, or, orElseThrow Operations with Optional
public class QUES_5 {
    public static void main(String[] args) throws Exception {
        List<Integer> iL = Arrays.asList(1,2,3,4,5,6,7,10,8);
        System.out.print("Element greater than 8 in the list : ");
        iL.stream()
          .filter(e->e>8)
          .findFirst()
          .ifPresentOrElse(System.out::println,() -> System.out.println("Value doesn't exist."));

        iL.stream()
          .filter(e -> e>10)
          .findFirst()
          .or(() -> Optional.of(-1))
          .ifPresent(System.out::println);

        iL.stream()
          .filter(e -> e>10).findFirst()
          .orElseThrow(() -> new Exception("Element greater than 10 not found."));
    }
}

