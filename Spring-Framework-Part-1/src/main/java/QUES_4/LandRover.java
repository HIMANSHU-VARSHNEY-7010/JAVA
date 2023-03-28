package QUES_4;

import org.springframework.stereotype.Component;
@Component
public class LandRover implements Car {
    private String Name = "Land Rover";
    private long Speed = 190;

    @Override
    public void showCarType() {
        System.out.println("LAND-ROVER IS A SUV CAR.");
    }

    @Override
    public String toString() {
        return "LandRover{" +
                "Name='" + Name + '\'' +
                ", Speed=" + Speed +
                '}';
    }
}
