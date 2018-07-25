package com.lukasz.engineerproject.app4train.repository.removeUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.User;

@Repository
public interface RemoveUsersRepository extends JpaRepository<User, Integer> {

}
