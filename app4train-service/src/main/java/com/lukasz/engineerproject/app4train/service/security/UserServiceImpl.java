package com.lukasz.engineerproject.app4train.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.UserForRegistration;
import com.lukasz.engineerproject.app4train.repository.security.UserForRegistrationRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserForRegistrationRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserForRegistration user = userRepository.findByUsername(username);
		return new ExtendUserDetails(user.getUsername(), user.getPassword(), true, true, true, true,
				user.getAuthorities());
	}
}
