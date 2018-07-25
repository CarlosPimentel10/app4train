package com.lukasz.engineerproject.app4train.service.getBodyMassIndexResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;
import com.lukasz.engineerproject.app4train.repository.getBodyMassIndexResult.GetBodyMassIndexResultRepository;

@Service
public class GetBodyMassIndexResultServiceImpl implements GetBodyMassIndexResultService {

	@Autowired
	GetBodyMassIndexResultRepository getBodyMassIndexResultRepository;

	public void save(BodyMassIndex bodyMassIndexDAO) {
		BodyMassIndex bodyMassIndex = new BodyMassIndex();
		bodyMassIndex.setUserGrowth(bodyMassIndexDAO.getUserGrowth());
		bodyMassIndex.setUserWeight(bodyMassIndexDAO.getUserWeight());
		bodyMassIndex.setUser(bodyMassIndexDAO.getUser());
		bodyMassIndex.setBodyMassIndexResult(getResultOfIndex(bodyMassIndex));
		getBodyMassIndexResultRepository.save(bodyMassIndex);
	}

	public double getResultOfIndex(BodyMassIndex bodyMassIndex) {
		Integer userGrowth = bodyMassIndex.getUserGrowth();
		Double userWeight = (double) bodyMassIndex.getUserWeight();
		Double result = userWeight / ((userGrowth / (double) 100) * (userGrowth / (double) 100));
		return result;
	}
}
