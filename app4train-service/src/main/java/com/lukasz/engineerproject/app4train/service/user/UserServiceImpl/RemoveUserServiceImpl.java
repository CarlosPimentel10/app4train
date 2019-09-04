package com.lukasz.engineerproject.app4train.service.user.UserServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import com.lukasz.engineerproject.app4train.repository.user.UserRepository;
import com.lukasz.engineerproject.app4train.service.user.RemoveUserService;
import org.springframework.stereotype.Service;

@Service
public class RemoveUserServiceImpl implements RemoveUserService {

	private final UserRepository userRepository;

	public RemoveUserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void removeUser(UserEntity userEntity) {
		userRepository.delete(userEntity);
	}
}
