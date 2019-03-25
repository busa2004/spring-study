package expert004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext appCtx = 
				new ClassPathXmlApplicationContext("config/example/expert.xml");
		Car car = (Car)appCtx.getBean("car");
		
		System.out.println(car.getTireBrand());
	}
}
