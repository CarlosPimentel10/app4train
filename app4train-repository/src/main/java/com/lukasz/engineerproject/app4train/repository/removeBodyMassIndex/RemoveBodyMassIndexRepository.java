package com.lukasz.engineerproject.app4train.repository.removeBodyMassIndex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;

@Repository
public interface RemoveBodyMassIndexRepository extends JpaRepository<BodyMassIndex, Integer> {

}
