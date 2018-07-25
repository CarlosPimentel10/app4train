package com.lukasz.engineerproject.app4train.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.UserForRegistration;
import com.lukasz.engineerproject.app4train.repository.security.UserForRegistrationRepository;
@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private UserForRegistrationRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public void saveUser(String userName, String userPassword) {
		UserForRegistration user = new UserForRegistration();
		user.setUsername(userName);
		user.setPassword(passwordEncoder.encode(userPassword));
		userRepository.save(user);
	}
}
