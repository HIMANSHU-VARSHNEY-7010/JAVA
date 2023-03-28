package QUES_4;
//		(4) Get a Spring Bean from application context and display its properties.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QUES_4 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(QUES_4.class);
		ComfortableCarImpl comfortableCar = applicationContext.getBean(ComfortableCarImpl.class);
		System.out.println(comfortableCar);
		comfortableCar.showProperties();
		comfortableCar.showCarType();
	}

}
