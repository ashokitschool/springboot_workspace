package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Address;

public interface AddrRepo extends JpaRepository<Address, Integer>{

}
