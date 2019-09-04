package com.lukasz.engineerproject.app4train.service.security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

class ExtendUserDetails extends User {

	ExtendUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
					  boolean credentialsNonExpired, boolean accountNonLocked,
					  Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}
}
