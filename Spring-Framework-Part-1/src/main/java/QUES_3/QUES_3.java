package QUES_3;
//		(3) Use @Component and @Autowired annotations to in Loosely Coupled code for dependency management.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QUES_3 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(QUES_3.class);
		ComfortableCarImpl comfortableCar = applicationContext.getBean(ComfortableCarImpl.class);
		comfortableCar.showCarType();
	}

}
