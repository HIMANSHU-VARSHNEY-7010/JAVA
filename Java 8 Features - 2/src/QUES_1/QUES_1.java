package QUES_1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//
//      Q1. Implement following functional interfaces from java.util.function using lambdas:
//            Consumer
//            Supplier
//            Predicate
//            Function
public class QUES_1 {
    public static void main(String[] args) {
        Consumer consumer = (a) -> {
            System.out.println("Consuming " + String.valueOf(a) + " Products.");
        };
        consumer.accept(2);

        Supplier supplier = () -> {
            return "Supplied 2 Products.";
        };
        System.out.println(supplier.get());

        Predicate<Integer> predicate = (age) -> {
            return age > 20;
        };
        System.out.println("Person's age is greater than 20 : " + predicate.test(22));

        Function<Integer, Double> function = (a) -> {
            return (double)(a * a) / 2.0;
        };
        System.out.println("Result of Function performed : " + function.apply(4));
    }
}
