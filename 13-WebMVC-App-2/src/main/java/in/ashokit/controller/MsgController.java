package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

	// URL : http://localhost:8080/greet?name=ashok
	
	@GetMapping("/greet")
	@ResponseBody
	public String greetMsg(@RequestParam("name") String name) {

		String msg = name + ", Good Morning..!!";

		return msg;
	}

	// URL : http://localhost:8080/course?c=sbms&t=ashok
	@GetMapping("/course")
	@ResponseBody
	public String getCourse(@RequestParam("c") String course, @RequestParam("t") String trainer) {

		String msg = course + " By " + trainer + " will start soon...";

		return msg;
	}

	// URL : http://localhost:8080/welcome/ashok
	
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String getWelcomeMsg(@PathVariable("name") String name) {

		String msg = name + ", Welcome to Ashok IT";

		return msg;
	}

}
