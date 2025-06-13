package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public void getUsers() {

		Iterable<User> all = userRepo.findByGender("Male");

		all.forEach(System.out::println);

	}

	public void getUser() {

		Optional<User> byId = userRepo.findById("101");

		if (byId.isPresent()) {
			User user = byId.get();
			System.out.println(user);
		} else {
			System.out.println("User not found");
		}
	}

	public void saveUser() {
		User u = new User();

		u.setUname("Sunil");
		u.setGender("Male");
		u.setCountry("India");
		u.setAge(29);

		userRepo.save(u); // INSERT + UPDATE = UPSERT

		System.out.println("User inserted");
	}
}
