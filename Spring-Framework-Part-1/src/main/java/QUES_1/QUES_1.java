package QUES_1;
//    (1) Write a program to demonstrate Tightly Coupled code.
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class QUES_1 {
	public static void main(String[] args) {
//		SpringApplication.run(SpringFrameworkPart1Application.class, args);
		ComfortableCarImpl comfortableCar = new ComfortableCarImpl();
		comfortableCar.showCarType();
	}

}
