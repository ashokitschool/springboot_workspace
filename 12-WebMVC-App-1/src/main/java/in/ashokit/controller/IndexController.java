package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String welcomeMsg(Model model) {

		return "indexNew";
	}

	@GetMapping("/courses")
	public String courses(Model model) {

		return "courses";
	}

	@GetMapping("/trainers")
	public String trainers(Model model) {

		return "trainers";
	}

	@GetMapping("/placements")
	public String placements(Model model) {

		return "placements";
	}

	@GetMapping("/contact")
	public String contact(Model model) {

		return "contact";
	}

	@GetMapping("/error")
	public String error(Model model) {

		return "error";
	}
}
