package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tcs.PwdSecurity;

@Configuration
@ComponentScan(basePackages = { "in.ashokit", "com.tcs" })
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}

	@Bean
	public PwdSecurity createBean() {

		PwdSecurity security = new PwdSecurity();

		// logic for security

		return security;
	}
}
