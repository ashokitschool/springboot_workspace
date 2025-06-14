package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MsgRestController {

	@GetMapping(value = "/welcome", produces = "text/plain")
	public String getWelcomeMsg(@RequestParam("name") String name) {

		String msg = name + ", Welcome to REST API..!!";

		return msg;
	}

	@GetMapping(value = "/greet/{name}", produces = "text/plain")
	public ResponseEntity<String> getGreetMsg(@PathVariable String name) {

		String msg = name + ", Good Morning..!!!";

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
