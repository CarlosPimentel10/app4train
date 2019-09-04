package com.lukasz.engineerproject.app4train.service.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.UserForRegistrationEntity;
import com.lukasz.engineerproject.app4train.repository.security.UserForRegistrationRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

	private final UserForRegistrationRepository userRepository;

	public UserServiceImpl(UserForRegistrationRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserForRegistrationEntity user = userRepository.findByUsername(username);
		return new ExtendUserDetails(
				user.getUsername(),
				user.getPassword(),
				true,
				true,
				true,
				true,
				user.getAuthorities());
	}
}
