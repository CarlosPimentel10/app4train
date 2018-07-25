package com.lukasz.engineerproject.app4train.repository.removeBasicMetabolicRate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;

@Repository
public interface RemoveBasicMetabolicRateRepository extends JpaRepository<BasicMetabolicRate, Integer> {

}
