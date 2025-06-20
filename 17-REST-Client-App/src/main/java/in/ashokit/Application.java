package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Quote;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		m1();
		System.out.println("======================================================");
		m2();
	}

	public static void m2() {

		RestTemplate rt = new RestTemplate();
		String apiUrl = "https://dummyjson.com/quotes/random";

		ResponseEntity<Quote> forEntity = rt.getForEntity(apiUrl, Quote.class);

		Quote body = forEntity.getBody();

		System.out.println(body);

	}

	public static void m1() {
		RestTemplate rt = new RestTemplate();

		String apiUrl = "https://dummyjson.com/quotes/random";

		ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);

		int value = forEntity.getStatusCode().value();

		if (value == 200) {
			String body = forEntity.getBody();
			System.out.println(body);
		}
	}

}
