package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.dto.Customer;

public class AppConverter {

	public static void main(String[] args) throws Exception {
		AppConverter ac = new AppConverter();
		// ac.convertToJson();

		ac.convertFromJson();
	}

	public void convertToJson() throws Exception {

		File file = new File("customer.json");

		Customer c = new Customer();
		c.setId(101);
		c.setName("Raja");
		c.setEmail("raja@gmail.com");
		c.setPhno(797979l);

		// serialization
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, c);

		System.out.println("Serialization Completed......");
	}

	public void convertFromJson() throws Exception {

		// load file into java program
		File file = new File("customer.json");

		// De-Serialization
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(file, Customer.class);

		System.out.println(c);

		System.out.println("De_serialization completed....");

	}

}
