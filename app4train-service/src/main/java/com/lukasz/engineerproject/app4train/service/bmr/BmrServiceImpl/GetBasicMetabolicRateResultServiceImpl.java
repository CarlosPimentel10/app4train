package com.lukasz.engineerproject.app4train.service.bmr.BmrServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;
import com.lukasz.engineerproject.app4train.repository.bmr.BasicMetabolicRateRepository;
import com.lukasz.engineerproject.app4train.service.bmr.GetBasicMetabolicRateResultService;
import org.springframework.stereotype.Service;

@Service
public class GetBasicMetabolicRateResultServiceImpl implements GetBasicMetabolicRateResultService {

	private final BasicMetabolicRateRepository basicMetabolicRateRepository;

	public GetBasicMetabolicRateResultServiceImpl(BasicMetabolicRateRepository basicMetabolicRateRepository) {
		this.basicMetabolicRateRepository = basicMetabolicRateRepository;
	}

	public void saveWhenUserIsMan(BasicMetabolicRateEntity basicMetabolicRateEntityDAO, Integer userAge, Double dryMuscleWeight,
								  Integer userGrowth) {
		basicMetabolicRateRepository.save(BasicMetabolicRateEntity.builder()
				.dryMuscleWeight(basicMetabolicRateEntityDAO.getDryMuscleWeight())
				.userGrowth(basicMetabolicRateEntityDAO.getUserGrowth())
				.userEntity(basicMetabolicRateEntityDAO.getUserEntity())
				.basicMetabolicRateResult((10.0 * dryMuscleWeight) + (6.25 * userGrowth) - (5.0 * (double) userAge) + 5)
				.build());
	}

	public void saveWhenUserIsWoman(BasicMetabolicRateEntity basicMetabolicRateEntityDAO, Integer userAge, Double dryMuscleWeight,
									Integer userGrowth) {

		basicMetabolicRateRepository.save(BasicMetabolicRateEntity.builder()
				.dryMuscleWeight(basicMetabolicRateEntityDAO.getDryMuscleWeight())
				.userGrowth(basicMetabolicRateEntityDAO.getUserGrowth())
				.userEntity(basicMetabolicRateEntityDAO.getUserEntity())
				.basicMetabolicRateResult(((10.0 * dryMuscleWeight) + (6.25 * (double) userGrowth) - (5.0 * (double) userAge)) - 161)
				.build());
	}
}
