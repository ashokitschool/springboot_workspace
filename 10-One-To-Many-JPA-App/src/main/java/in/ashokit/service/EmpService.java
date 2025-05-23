package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Address;
import in.ashokit.entities.Employee;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo empRepo;

	public void saveEmpWithAddr() {

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("PRESENT");

		Address a2 = new Address();
		a2.setCity("Guntur");
		a2.setState("AP");
		a2.setType("PERMENENT");

		Employee e = new Employee();
		e.setName("Raj");
		e.setSalary(45000.00);

		// associating emp obj with addr objs
		a1.setEmp(e);
		a2.setEmp(e);

		// associate addrs objs with emp obj
		e.setAddrList(Arrays.asList(a1, a2));

		// save parent record
		empRepo.save(e);

		System.out.println("Employee saved..");

	}
	
	
	public void getEmp() {
		empRepo.findById(1);
	}
}
