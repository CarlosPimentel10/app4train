package com.lukasz.engineerproject.app4train.service.showUsers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.repository.addUser.ShowAllUsersRepository;

@Service
public class ShowUsersServiceImpl implements ShowUsersService {

	@Autowired
	private ShowAllUsersRepository showAllUsersRepository;

	public List<User> getAllUsers() {
		return showAllUsersRepository.getAllUsers();
	}
}
