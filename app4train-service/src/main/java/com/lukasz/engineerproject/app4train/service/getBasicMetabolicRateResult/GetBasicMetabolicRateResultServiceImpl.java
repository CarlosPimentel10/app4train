package com.lukasz.engineerproject.app4train.service.getBasicMetabolicRateResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.repository.getBasicMetabolicRateResult.GetBasicMetabolicRateResult;

@Service
public class GetBasicMetabolicRateResultServiceImpl implements GetBasicMetabolicRateResultService {

	@Autowired
	private GetBasicMetabolicRateResult getBasicMetabolicRateResult;

	public void saveWhenUserIsMan(BasicMetabolicRate basicMetabolicRateDAO, Integer userAge, Double dryMuscleWeight,
			Integer userGrowth) {
		BasicMetabolicRate basicMetabolicRate = new BasicMetabolicRate();
		basicMetabolicRate.setDryMuscleWeight(basicMetabolicRateDAO.getDryMuscleWeight()); //
		basicMetabolicRate.setUserGrowth(basicMetabolicRateDAO.getUserGrowth());
		basicMetabolicRate.setUser(basicMetabolicRateDAO.getUser());
		basicMetabolicRate.setBasicMetabolicRateResult(
				(10.0 * (double) dryMuscleWeight) + (6.25 * userGrowth) - (5.0 * (double) userAge) + 5);
		getBasicMetabolicRateResult.save(basicMetabolicRate);
	}

	public void saveWhenUserIsWoman(BasicMetabolicRate basicMetabolicRateDAO, Integer userAge, Double dryMuscleWeight,
			Integer userGrowth) {
		BasicMetabolicRate basicMetabolicRate = new BasicMetabolicRate();
		basicMetabolicRate.setDryMuscleWeight(basicMetabolicRateDAO.getDryMuscleWeight()); //
		basicMetabolicRate.setUserGrowth(basicMetabolicRateDAO.getUserGrowth());
		basicMetabolicRate.setUser(basicMetabolicRateDAO.getUser());
		basicMetabolicRate.setBasicMetabolicRateResult(
				((10.0 * (double) dryMuscleWeight) + (6.25 * (double) userGrowth) - (5.0 * (double) userAge)) - 161);
		getBasicMetabolicRateResult.save(basicMetabolicRate);
	}
}
