package com.lukasz.engineerproject.app4train.repository.getBodyMassIndexResult;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;

@Repository
public interface ShowAllBodyMassIndexRepository extends JpaRepository<BodyMassIndex, Long>{

	@Query("select b from BodyMassIndex b order by b.bodyMassIndexResult")
	List<BodyMassIndex> getAllBodyMassIndex();
}