package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.dto.UserDto;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user", new UserDto());
		return "index";
	}

	@PostMapping("/user-submit")
	@ResponseBody
	public String handleSubmit(UserDto user) {
		System.out.println(user);
		return "Form Submitted";
	}
}
