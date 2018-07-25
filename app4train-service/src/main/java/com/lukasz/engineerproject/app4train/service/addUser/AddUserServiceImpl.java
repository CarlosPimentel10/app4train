package com.lukasz.engineerproject.app4train.service.addUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.repository.addUser.AddUserRepository;

@Service
public class AddUserServiceImpl implements AddUserService {

	@Autowired
	private AddUserRepository addStudentRepository;

	public void saveUser(User userDAO) {

		User user = new User();
		user.setFirstName(userDAO.getFirstName());
		user.setLastName(userDAO.getLastName());
		user.setAge(userDAO.getAge());
		user.setGender(userDAO.getGender());
		addStudentRepository.save(user);
	}
}
