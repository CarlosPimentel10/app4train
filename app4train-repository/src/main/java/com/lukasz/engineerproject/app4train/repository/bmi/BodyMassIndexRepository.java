package com.lukasz.engineerproject.app4train.repository.bmi;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;

@Repository
public interface BodyMassIndexRepository extends JpaRepository<BodyMassIndexEntity, Long>{

	@Query("select b from BodyMassIndexEntity b order by b.bodyMassIndexResult")
	List<BodyMassIndexEntity> getAllBodyMassIndex();
}