package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entites.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
