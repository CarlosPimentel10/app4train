package com.lukasz.engineerproject.app4train.service.bmr;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;

public interface GetBasicMetabolicRateResultService {

	void saveWhenUserIsMan(BasicMetabolicRateEntity basicMetabolicRateEntityDAO, Integer userAge, Double dryMuscleWeight,
						   Integer userGrowth);

	void saveWhenUserIsWoman(BasicMetabolicRateEntity basicMetabolicRateEntityDAO, Integer userAge, Double dryMuscleWeight,
							 Integer userGrowth);
}
