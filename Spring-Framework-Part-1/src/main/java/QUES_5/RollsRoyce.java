package QUES_5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("Rolls Royce")   /*    if both the @Qualifier and @Primary annotations are present,
                                    then the @Qualifier annotation will have precedence  */
@Component
public class RollsRoyce implements Car {
    @Override
    public void showCarType() {
        System.out.println("ROLLS-ROYCE IS A LUXURY CAR.");
        System.out.println("ROLLS-ROYCE IS THE QUALIFIER CAR.");
    }
}
