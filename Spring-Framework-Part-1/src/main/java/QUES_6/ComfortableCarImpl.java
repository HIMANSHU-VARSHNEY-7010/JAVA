package QUES_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComfortableCarImpl {

    Car car;
//    @Autowired    //    Inject Bean of Rolls-Royce
//    public ComfortableCarImpl(@Qualifier("RR") Car car) {
//        this.car = car;
//    }
    @Autowired    //    Inject Bean of Lamborghini
    public ComfortableCarImpl(@Qualifier("Lambo") Car car){
        this.car = car;
    }
    public void showCarType(){
        this.car.showCarType();
    }
}
