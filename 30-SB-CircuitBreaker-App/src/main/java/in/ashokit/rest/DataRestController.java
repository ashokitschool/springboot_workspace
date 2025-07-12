package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "ashokit")
	public String getDataFromRedis() {

		System.out.println("*** redis() method called.. ***");

		// TODO : Redis connection
		
		int i = 10/0;

		return "Retrieved Data From Redis";

	}

	public String getDataFromDB(Throwable t) {
		System.out.println("*** db() method called.. ***");
		return "Retrieved Data From Database";
	}

}
