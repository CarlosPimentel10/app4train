package com.lukasz.engineerproject.app4train.repository.getBodyAdiposityIndexResult;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;

@Repository
public interface ShowAllBodyAdiposityIndexRepository extends JpaRepository<BodyAdiposityIndex, Long> {

	@Query("select b from BodyAdiposityIndex b order by b.bodyAdiposityIndexResult")
	List<BodyAdiposityIndex> getAllBodyAdiposityIndex();
}