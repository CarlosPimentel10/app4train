package com.lukasz.engineerproject.app4train.repository.getBasicMetabolicRateResult;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;

@Repository
public interface GetBasicMetabolicRateResult extends JpaRepository<BasicMetabolicRate, Long> {

}
