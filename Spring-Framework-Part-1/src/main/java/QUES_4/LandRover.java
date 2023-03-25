package QUES_4;

import org.springframework.stereotype.Component;
@Component
public class LandRover implements Car {
    @Override
    public void showCarType() {
        System.out.println("LAND-ROVER IS A SUV CAR.");
    }
}
