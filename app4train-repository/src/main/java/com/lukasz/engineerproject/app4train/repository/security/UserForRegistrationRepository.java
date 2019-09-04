package com.lukasz.engineerproject.app4train.repository.security;

import com.lukasz.engineerproject.app4train.model.domain.UserForRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserForRegistrationRepository extends JpaRepository<UserForRegistrationEntity, Integer> {

	@Query("select u from UserForRegistrationEntity u where u.username=:username")
	UserForRegistrationEntity findByUsername(@Param("username") String username);
}
