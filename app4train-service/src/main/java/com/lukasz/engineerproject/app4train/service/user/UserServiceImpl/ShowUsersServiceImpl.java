package com.lukasz.engineerproject.app4train.service.user.UserServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import com.lukasz.engineerproject.app4train.repository.user.UserRepository;
import com.lukasz.engineerproject.app4train.service.user.ShowUsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowUsersServiceImpl implements ShowUsersService {

	private final UserRepository showAllUsersRepository;

	public ShowUsersServiceImpl(UserRepository showAllUsersRepository) {
		this.showAllUsersRepository = showAllUsersRepository;
	}

	public List<UserEntity> getAllUsers() {
		return showAllUsersRepository.getAllUsers();
	}
}
