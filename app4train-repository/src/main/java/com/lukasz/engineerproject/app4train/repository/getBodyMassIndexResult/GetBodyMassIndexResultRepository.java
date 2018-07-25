package com.lukasz.engineerproject.app4train.repository.getBodyMassIndexResult;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;

@Repository
public interface GetBodyMassIndexResultRepository extends JpaRepository<BodyMassIndex, Long> {

}
