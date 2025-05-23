package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	// URL :: http://localhost:8080/user/info
	@GetMapping
	public ModelAndView getUser() {

		ModelAndView mav = new ModelAndView();

		// sending data to UI in K-V format
		mav.addObject("msg", "User Name : John");

		mav.setViewName("index");

		return mav;
	}

}
