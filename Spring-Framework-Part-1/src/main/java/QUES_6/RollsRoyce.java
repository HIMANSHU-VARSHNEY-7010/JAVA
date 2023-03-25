package QUES_6;

import org.springframework.stereotype.Component;
@Component("RR")
public class RollsRoyce implements Car {
    @Override
    public void showCarType() {
        System.out.println("ROLLS-ROYCE IS A LUXURY CAR.");
    }
}
