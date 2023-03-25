package QUES_2;
//		(2) Write a program to demonstrate Loosely Coupled code.
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QUES_2 {
	public static void main(String[] args) {
		Car car = new RollsRoyce();
		ComfortableCarImpl comfortableCar = new ComfortableCarImpl(car);
		comfortableCar.showCarType();
	}

}
