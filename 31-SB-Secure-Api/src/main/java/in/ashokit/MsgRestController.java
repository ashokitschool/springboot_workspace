package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Good Mrng..!!";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Ashok IT";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Contact US : + 91 - 9985396677";
	}

}
