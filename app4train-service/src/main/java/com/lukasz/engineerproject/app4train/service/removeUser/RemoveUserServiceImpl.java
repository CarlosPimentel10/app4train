package com.lukasz.engineerproject.app4train.service.removeUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.User;
import com.lukasz.engineerproject.app4train.repository.removeUser.RemoveUsersRepository;

@Service
public class RemoveUserServiceImpl implements RemoveUserService {

	@Autowired
	private RemoveUsersRepository removeUsersRepository;

	public void removeUser(User user) {
		removeUsersRepository.delete(user);
	}
}
