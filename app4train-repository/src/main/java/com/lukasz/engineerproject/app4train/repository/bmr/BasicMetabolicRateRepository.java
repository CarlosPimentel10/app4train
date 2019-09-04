package com.lukasz.engineerproject.app4train.repository.bmr;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;

@Repository
public interface BasicMetabolicRateRepository extends JpaRepository<BasicMetabolicRateEntity, Long> {

	@Query("select b from BasicMetabolicRateEntity b order by b.basicMetabolicRateResult")
	List<BasicMetabolicRateEntity> getAllBasicMetabolicRate();
}