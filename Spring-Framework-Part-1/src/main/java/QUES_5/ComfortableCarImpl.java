package QUES_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComfortableCarImpl {
    @Autowired
    @Qualifier("Rolls Royce")
    Car car;

    public void showCarType(){
        this.car.showCarType();
    }
}
