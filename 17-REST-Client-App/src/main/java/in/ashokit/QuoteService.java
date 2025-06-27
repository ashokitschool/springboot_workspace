package in.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Quote;
import in.ashokit.binding.QuotesResponseDto;

@Service
public class QuoteService {

	@Value("${quotes.random.api.url}")
	private String randomQuoteApiUrl;

	public void m3() {
		RestTemplate rt = new RestTemplate();

		String apiUrl = "https://dummyjson.com/quotes";

		ResponseEntity<QuotesResponseDto> forEntity = rt.getForEntity(apiUrl, QuotesResponseDto.class);
		QuotesResponseDto body = forEntity.getBody();
		List<Quote> quotes = body.getQuotes();
		quotes.forEach(System.out::println);

	}

	public void m2() {

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Quote> forEntity = rt.getForEntity(randomQuoteApiUrl, Quote.class);

		Quote body = forEntity.getBody();

		System.out.println(body);

	}

	public void m1() {
		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> forEntity = rt.getForEntity(randomQuoteApiUrl, String.class);

		int value = forEntity.getStatusCode().value();

		if (value == 200) {
			String body = forEntity.getBody();
			System.out.println(body);
		}
	}

}
