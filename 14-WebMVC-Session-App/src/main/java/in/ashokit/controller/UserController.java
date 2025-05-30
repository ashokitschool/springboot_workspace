package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.UserDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {

		UserDto userDto = new UserDto();
		model.addAttribute("user", userDto);

		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") UserDto user, HttpServletRequest req, Model model) {

		String email = user.getEmail();
		String pwd = user.getPwd();

		if (email.equals("admin@gmail.com") && pwd.equals("admin@123")) {

			// create new session and store obj
			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);

			return "redirect:dashboard";
		} else {
			model.addAttribute("msg", "Invalid Credentials");
			return "index";
		}
	}

	@GetMapping("/dashboard")
	public String buildDashboard(HttpServletRequest req, Model model) {

		// get existing session and retrieve obj
		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		model.addAttribute("email", email);

		// TODO : Get Courses purchased by user based on email

		return "dashboard";
	}

	@GetMapping("/edu-details")
	public String ed(HttpServletRequest req, Model model) {

		// get existing session and retrieve obj
		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		model.addAttribute("email", email);

		// TODO : Get education details based on email

		return "dashboard";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {

		// get existing session
		HttpSession session = req.getSession(false);

		// remove session
		session.invalidate();

		return "redirect:/";
	}
}
