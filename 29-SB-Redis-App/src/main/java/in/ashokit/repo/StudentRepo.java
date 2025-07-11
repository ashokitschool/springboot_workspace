package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
