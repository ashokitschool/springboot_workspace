package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.ATM;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");

		ATM atm = ctxt.getBean(ATM.class);

		atm.withdraw();
	}

}
