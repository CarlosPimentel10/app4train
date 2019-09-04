package com.lukasz.engineerproject.app4train.service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.UserForRegistrationEntity;
import com.lukasz.engineerproject.app4train.repository.security.UserForRegistrationRepository;
@Service
public class RegisterUserServiceImpl implements RegisterUserService {


	private final UserForRegistrationRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	public RegisterUserServiceImpl(UserForRegistrationRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void saveUser(String userName, String userPassword) {
		UserForRegistrationEntity user = new UserForRegistrationEntity();
		user.setUsername(userName);
		user.setPassword(passwordEncoder.encode(userPassword));
		userRepository.save(user);
	}
}
