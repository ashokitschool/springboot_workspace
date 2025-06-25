package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@GetMapping("/product")
	public ResponseEntity<String> getWelcomeMsg() {

		String msg = "IPhone Cost is 68,000";

		int i = 10 / 0;

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
