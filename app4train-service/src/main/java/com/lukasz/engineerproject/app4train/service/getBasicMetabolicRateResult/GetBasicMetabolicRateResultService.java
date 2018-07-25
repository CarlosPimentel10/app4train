package com.lukasz.engineerproject.app4train.service.getBasicMetabolicRateResult;

import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;

public interface GetBasicMetabolicRateResultService {

	public void saveWhenUserIsMan(BasicMetabolicRate basicMetabolicRateDAO, Integer userAge, Double dryMuscleWeight,
			Integer userGrowth);

	public void saveWhenUserIsWoman(BasicMetabolicRate basicMetabolicRateDAO, Integer userAge, Double dryMuscleWeight,
			Integer userGrowth);
}
