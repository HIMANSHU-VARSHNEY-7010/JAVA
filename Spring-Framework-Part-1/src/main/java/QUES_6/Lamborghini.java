package QUES_6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("Lambo")
public class Lamborghini implements Car {
    @Override
    public void showCarType() {
        System.out.println("LAMBORGHINI IS A SPORTS CAR.");
    }
}
