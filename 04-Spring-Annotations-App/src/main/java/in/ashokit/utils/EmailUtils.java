package in.ashokit.utils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {

	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("init() method called....");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called....");
	}
}
