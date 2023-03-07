package QUES_4;
//  Q4) Write a program to implement constructor reference
public class QUES_4 {
    public static void main(String[] args) {
        Car car = SuperCar::new;
        car.body();
    }
}
