package com.lukasz.engineerproject.app4train.repository.addUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lukasz.engineerproject.app4train.model.entity.User;

@Repository
public interface AddUserRepository extends JpaRepository<User, Integer>  {

}
