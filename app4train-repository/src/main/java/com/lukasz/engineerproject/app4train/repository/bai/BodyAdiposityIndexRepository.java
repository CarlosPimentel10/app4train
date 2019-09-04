package com.lukasz.engineerproject.app4train.repository.bai;

import java.util.List;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyAdiposityIndexRepository extends JpaRepository<BodyAdiposityIndexEntity, Long> {

	@Query("select b from BodyAdiposityIndexEntity b order by b.bodyAdiposityIndexResult")
	List<BodyAdiposityIndexEntity> getAllBodyAdiposityIndex();
}