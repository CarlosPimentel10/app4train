package com.lukasz.engineerproject.app4train.service.user.UserServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;

import com.lukasz.engineerproject.app4train.service.user.AddUserService;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.repository.user.UserRepository;

@Service
public class AddUserServiceImpl implements AddUserService {

	private final UserRepository addStudentRepository;

	public AddUserServiceImpl(UserRepository addStudentRepository) {
		this.addStudentRepository = addStudentRepository;
	}

	public void saveUser(UserEntity userEntityDAO) {

		UserEntity userEntity = prepareUserEntity(userEntityDAO);
		addStudentRepository.save(userEntity);
	}

	private UserEntity prepareUserEntity(UserEntity userEntityDAO) {

		return UserEntity.builder()
				.firstName(userEntityDAO.getFirstName())
				.lastName(userEntityDAO.getLastName())
				.age(userEntityDAO.getAge())
				.gender(userEntityDAO.getGender())
				.build();
	}
}
