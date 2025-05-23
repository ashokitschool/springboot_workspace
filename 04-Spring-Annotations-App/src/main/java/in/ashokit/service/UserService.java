package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void getName() {
		String nameById = userDao.getNameById(101);
		System.out.println(nameById);
	}
	
	

}
