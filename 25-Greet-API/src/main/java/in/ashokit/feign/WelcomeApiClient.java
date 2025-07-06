package in.ashokit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="24-WELCOME-API")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();	

}
