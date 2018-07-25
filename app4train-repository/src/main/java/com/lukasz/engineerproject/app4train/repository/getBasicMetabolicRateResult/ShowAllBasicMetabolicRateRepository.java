package com.lukasz.engineerproject.app4train.repository.getBasicMetabolicRateResult;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;

@Repository
public interface ShowAllBasicMetabolicRateRepository extends JpaRepository<BasicMetabolicRate, Long> {

	@Query("select b from BasicMetabolicRate b order by b.basicMetabolicRateResult")
	List<BasicMetabolicRate> getAllBasicMetabolicRate();
}