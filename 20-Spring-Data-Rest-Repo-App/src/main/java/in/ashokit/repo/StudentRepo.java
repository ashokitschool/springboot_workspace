package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.ashokit.entity.Student;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long> {
}
