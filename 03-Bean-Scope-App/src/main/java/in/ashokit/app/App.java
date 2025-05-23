package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.dao.UserDao;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");

		UserDao u1 = ctxt.getBean(UserDao.class);

		UserDao u2 = ctxt.getBean(UserDao.class);
	}
}
