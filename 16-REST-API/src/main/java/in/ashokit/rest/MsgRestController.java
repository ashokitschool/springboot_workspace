package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppProperties;

@RestController
@RequestMapping("/api")
public class MsgRestController {

	@Value("${app.messages.greet}")
	private String greetMsg;

	@Autowired
	private AppProperties appProps;

	@GetMapping(value = "/greet", produces = "text/plain")
	public String getGreetMsg(@RequestParam("name") String name) {

		String msg = name + ", " + greetMsg;

		return msg;
	}

	@GetMapping(value = "/welcome/{name}", produces = "text/plain")
	public ResponseEntity<String> getWelcomeMsg(@PathVariable String name) {

		Map<String, String> messages = appProps.getMessages();
		//System.out.println(messages);

		String welcomeMsg = messages.get("welcome");

		String msg = name + ", " + welcomeMsg;

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
