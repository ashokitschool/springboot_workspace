package in.ashokit.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.ExInfo;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {

		String msg = "Welcome To Ashok IT";

		int i = 10 / 0;

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg() {

		String msg = "Good Mrng..!!";

		String s = null;
		s.length();

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}


}
