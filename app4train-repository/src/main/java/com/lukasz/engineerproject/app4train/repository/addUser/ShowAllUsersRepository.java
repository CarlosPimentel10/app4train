package com.lukasz.engineerproject.app4train.repository.addUser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.lukasz.engineerproject.app4train.model.entity.User;

@Repository
public interface ShowAllUsersRepository extends JpaRepository<User, Long>{

	@Query("select u from User u order by u.firstName")
	List<User> getAllUsers();
}
