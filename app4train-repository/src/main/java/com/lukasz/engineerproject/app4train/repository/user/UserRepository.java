package com.lukasz.engineerproject.app4train.repository.user;

import com.lukasz.engineerproject.app4train.model.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>  {

	@Query("select u from UserEntity u order by u.firstName")
	List<UserEntity> getAllUsers();
}
