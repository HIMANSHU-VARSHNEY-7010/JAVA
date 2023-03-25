package QUES_5;
//		(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary).
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QUES_5 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(QUES_5.class);
		ComfortableCarImpl comfortableCar = applicationContext.getBean(ComfortableCarImpl.class);
		comfortableCar.showCarType();
	}

}
