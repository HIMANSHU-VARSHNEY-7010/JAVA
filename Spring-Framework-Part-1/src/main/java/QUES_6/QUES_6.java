package QUES_6;
//		(6) Perform Constructor Injection in a Spring Bean.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QUES_6 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(QUES_6.class);
		ComfortableCarImpl comfortableCar = applicationContext.getBean(ComfortableCarImpl.class);
		comfortableCar.showCarType();

	}

}
