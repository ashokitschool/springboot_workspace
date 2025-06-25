package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.UserNotFoundException;

@RestController
public class UserRestController {

	@GetMapping("/user/{userId}")
	public ResponseEntity<String> getUser(@PathVariable Integer userId) {

		if (userId > 100) {
			throw new UserNotFoundException("Invalid UserId");
		}

		String user = "Raju is a manager";

		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	

}
