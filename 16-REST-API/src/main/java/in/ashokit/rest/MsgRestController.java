package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		String msg = "Welcome to REST API..!!";

		return msg;
	}

	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg() {

		String msg = "Good Morning..!!!";

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
