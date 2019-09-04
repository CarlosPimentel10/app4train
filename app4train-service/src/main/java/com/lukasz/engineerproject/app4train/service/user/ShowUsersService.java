package com.lukasz.engineerproject.app4train.service.user;

import java.util.List;
import com.lukasz.engineerproject.app4train.model.domain.UserEntity;

public interface ShowUsersService {
	List<UserEntity> getAllUsers();
}
