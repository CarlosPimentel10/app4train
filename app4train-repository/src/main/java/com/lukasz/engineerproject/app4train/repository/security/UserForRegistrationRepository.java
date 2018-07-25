package com.lukasz.engineerproject.app4train.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.UserForRegistration;

@Repository
public interface UserForRegistrationRepository extends JpaRepository<UserForRegistration, Integer> {

	@Query("select u from UserForRegistration u where u.username=:username")
	UserForRegistration findByUsername(@Param("username") String username);
}
