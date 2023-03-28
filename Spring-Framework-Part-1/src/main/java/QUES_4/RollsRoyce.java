package QUES_4;
public class RollsRoyce implements Car {
    private String Name = "Rolls Royce";
    private long Speed = 220;

    @Override
    public void showCarType() {
        System.out.println("ROLLS-ROYCE IS A LUXURY CAR.");
    }

    @Override
    public String toString() {
        return "RollsRoyce{" +
                "Name='" + Name + '\'' +
                ", Speed=" + Speed +
                '}';
    }
}
