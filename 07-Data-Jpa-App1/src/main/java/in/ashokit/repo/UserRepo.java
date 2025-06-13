package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

public interface UserRepo extends CrudRepository<User, String> {

	@Query(value = "select * from user", nativeQuery = true)
	public List<User> m1();

	@Query(value = "from User")
	public List<User> m2();

	public List<User> findByGender(String gender);

	public List<User> findByAge(int age);

	public List<User> findByAgeGreaterThanEqual(int age);

	public List<User> findByGenderAndCountry(String gender, String country);

}