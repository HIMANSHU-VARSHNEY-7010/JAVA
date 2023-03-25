package QUES_5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary     /*  Without @Primary - Consider marking one of the beans as @Primary, updating the consumer to
                 accept multiple beans, or using @Qualifier to identify the bean that should be consumed  */
public class LandRover implements Car {
    @Override
    public void showCarType() {
        System.out.println("LAND-ROVER IS A SUV CAR.");
        System.out.println("LAND-ROVER IS THE PRIMARY CAR.");
    }
}
