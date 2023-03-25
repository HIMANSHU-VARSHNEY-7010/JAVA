package QUES_5;

import org.springframework.stereotype.Component;

@Component
public class Lamborghini implements Car {
    @Override
    public void showCarType() {
        System.out.println("LAMBORGHINI IS A SPORTS CAR.");
    }
}
