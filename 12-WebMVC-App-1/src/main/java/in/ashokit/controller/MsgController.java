package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/msg")
public class MsgController {

	// URL : http://localhost:8080/msg/greet

	@GetMapping("/greet")
	public ModelAndView greetMsg() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning..!!");
		mav.setViewName("index");

		return mav;
	}

	// URL : http://localhost:8080/msg/welcome

	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {

		model.addAttribute("msg", "Welcome to Ashok IT..!!");

		return "index";
	}
}
