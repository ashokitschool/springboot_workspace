package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Quote;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

	private String RANDOM_QUOTE_URL = "https://dummyjson.com/quotes/{id}";

	public void getRandomQuote() {
		
		WebClient webClient = WebClient.create();
		
		//System.out.println(webClient.getClass().getName());
		
		Mono<Quote> bodyToMono = webClient.get()
								         .uri(RANDOM_QUOTE_URL, 100)
								         .retrieve()
								         .bodyToMono(Quote.class);
		
		// making synchronus call using WebClient (blocking thread)
		Quote q = bodyToMono.block();
		
		System.out.println(q);

	}
	
	public void getQuoteAsync() {
		WebClient webClient = WebClient.create();
		
		webClient.get()
				 .uri(RANDOM_QUOTE_URL, 200)
				 .retrieve()
				 .bodyToMono(Quote.class)
				 .subscribe(response -> {
					 handleResponse(response);
				 });
		
		System.out.println("Request Sending Completed .........");
	}
	
	private void handleResponse(Quote response) {
		System.out.println(response);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
