package com.lukasz.engineerproject.app4train.service.getBodyAdiposityIndexResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.repository.getBodyAdiposityIndexResult.GetBodyAdiposityIndexResultRepository;

@Service
public class GetBodyAdiposityIndexResultServiceImpl implements GetBodyAdiposityIndexResultService {

	@Autowired
	GetBodyAdiposityIndexResultRepository getBodyAdiposityIndexResultRepository;

	public void save(BodyAdiposityIndex bodyAdiposityIndexDAO) {
		BodyAdiposityIndex bodyAdiposiityIndex = new BodyAdiposityIndex();
		bodyAdiposiityIndex.setHipCircumference(bodyAdiposityIndexDAO.getHipCircumference());
		bodyAdiposiityIndex.setUserGrowth(bodyAdiposityIndexDAO.getUserGrowth());
		bodyAdiposiityIndex.setBodyAdiposityIndexResult(getResultOfIndex(bodyAdiposiityIndex));
		bodyAdiposiityIndex.setUser(bodyAdiposityIndexDAO.getUser());
		getBodyAdiposityIndexResultRepository.save(bodyAdiposiityIndex);
	}

	private double getResultOfIndex(BodyAdiposityIndex bodyAdiposityIndex) {
		Double hipCircumference = bodyAdiposityIndex.getHipCircumference();
		Integer userGrowth = bodyAdiposityIndex.getUserGrowth();
		Double result = (((100 * hipCircumference / (double) 100)
				/ ((userGrowth / (double) 100) * Math.sqrt(userGrowth / (double) 100))) - 18);
		return result;
	}
}
