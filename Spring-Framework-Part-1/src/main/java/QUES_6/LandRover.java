package QUES_6;

import org.springframework.stereotype.Component;
@Component("LR")
public class LandRover implements Car {
    @Override
    public void showCarType() {
        System.out.println("LAND-ROVER IS A SUV CAR.");
    }
}
