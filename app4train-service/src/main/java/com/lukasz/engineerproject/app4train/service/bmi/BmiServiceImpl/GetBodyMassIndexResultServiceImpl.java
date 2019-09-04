package com.lukasz.engineerproject.app4train.service.bmi.BmiServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;
import com.lukasz.engineerproject.app4train.repository.bmi.BodyMassIndexRepository;
import com.lukasz.engineerproject.app4train.service.bmi.GetBodyMassIndexResultService;
import org.springframework.stereotype.Service;

@Service
public class GetBodyMassIndexResultServiceImpl implements GetBodyMassIndexResultService {

	private final BodyMassIndexRepository bodyMassIndexRepository;

	public GetBodyMassIndexResultServiceImpl(BodyMassIndexRepository bodyMassIndexRepository) {
		this.bodyMassIndexRepository = bodyMassIndexRepository;
	}

	public void save(BodyMassIndexEntity bodyMassIndexEntityDAO) {
		BodyMassIndexEntity bodyMassIndexEntity = prepareBodyMassIndexEntity(bodyMassIndexEntityDAO);
		bodyMassIndexRepository.save(bodyMassIndexEntity);
	}

	private BodyMassIndexEntity prepareBodyMassIndexEntity(BodyMassIndexEntity bodyMassIndexEntityDAO) {

		BodyMassIndexEntity bodyMassIndexEntity = BodyMassIndexEntity.builder()
				.userEntity(bodyMassIndexEntityDAO.getUserEntity())
				.userGrowth(bodyMassIndexEntityDAO.getUserGrowth())
				.userWeight(bodyMassIndexEntityDAO.getUserWeight())
				.build();

		bodyMassIndexEntity.setBodyMassIndexResult(getResultOfIndex(bodyMassIndexEntity));

		return bodyMassIndexEntity;
	}

	private double getResultOfIndex(BodyMassIndexEntity bodyMassIndexEntity) {
		Integer userGrowth = bodyMassIndexEntity.getUserGrowth();
		double userWeight = bodyMassIndexEntity.getUserWeight();
		return userWeight / ((userGrowth / (double) 100) * (userGrowth / (double) 100));
	}
}
