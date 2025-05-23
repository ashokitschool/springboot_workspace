package in.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entites.Passport;
import in.ashokit.entites.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;

	public void savePersonWithPassport() {

		Passport pp = new Passport();
		pp.setPassportNum("J97979SDF");
		pp.setIssuedDt(LocalDate.now());
		pp.setExpDt(LocalDate.now().plusYears(10));

		Person p = new Person();
		p.setName("John");
		p.setGender("Male");

		// associating entities
		p.setPassport(pp);
		pp.setPerson(p);

		// save the person
		personRepo.save(p);

		System.out.println("Record saved...!!");
	}

	public void getPerson() {
		Optional<Person> byId = personRepo.findById(1);
		if (byId.isPresent()) {
			Person person = byId.get();
			System.out.println("Name : " + person.getName());
		}
	}
}