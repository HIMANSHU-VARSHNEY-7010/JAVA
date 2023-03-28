package QUES_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComfortableCarImpl {
    @Autowired
    Car car;
    public void showCarType(){
        this.car.showCarType();
    }
    public void showProperties(){
        System.out.println(this.car.toString());
    }
}
