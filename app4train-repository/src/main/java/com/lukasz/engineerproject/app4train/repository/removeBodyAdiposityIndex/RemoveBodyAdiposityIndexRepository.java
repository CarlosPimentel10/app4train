package com.lukasz.engineerproject.app4train.repository.removeBodyAdiposityIndex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;

@Repository
public interface RemoveBodyAdiposityIndexRepository extends JpaRepository<BodyAdiposityIndex, Integer> {

}
