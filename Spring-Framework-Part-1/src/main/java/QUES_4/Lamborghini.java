package QUES_4;
public class Lamborghini implements Car {
private String Name = "Lamborghini";
private long Speed = 300;

    @Override
    public void showCarType() {
        System.out.println("LAMBORGHINI IS A SPORTS CAR.");
    }
    @Override
    public String toString() {
        return "Lamborghini{" +
                "Name='" + Name + '\'' +
                ", Speed=" + Speed +
                '}';
    }
}
