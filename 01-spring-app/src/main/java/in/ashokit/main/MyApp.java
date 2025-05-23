package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

public class MyApp {

	public static void main(String[] args) {

		// Start IOC container by giving xml file as input
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");

		System.out.println("========== IOC Started ==========");

		// getting bean obj from IOC

		Car car = ctxt.getBean(Car.class);
		car.drive();
	}
}
