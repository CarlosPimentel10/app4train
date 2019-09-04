package com.lukasz.engineerproject.app4train.service.bai.BaiServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import com.lukasz.engineerproject.app4train.repository.bai.BodyAdiposityIndexRepository;
import com.lukasz.engineerproject.app4train.service.bai.GetBodyAdiposityIndexResultService;
import org.springframework.stereotype.Service;

@Service
public class GetBodyAdiposityIndexResultServiceImpl implements GetBodyAdiposityIndexResultService {

	private final BodyAdiposityIndexRepository bodyAdiposityIndexRepository;

	public GetBodyAdiposityIndexResultServiceImpl(BodyAdiposityIndexRepository bodyAdiposityIndexRepository) {
		this.bodyAdiposityIndexRepository = bodyAdiposityIndexRepository;
	}

	public void save(BodyAdiposityIndexEntity bodyAdiposityIndexEntityDAO) {

		BodyAdiposityIndexEntity bodyAdiposityIndexEntity = BodyAdiposityIndexEntity.builder()
				.hipCircumference(bodyAdiposityIndexEntityDAO.getHipCircumference())
				.userGrowth(bodyAdiposityIndexEntityDAO.getUserGrowth())
				.userEntity(bodyAdiposityIndexEntityDAO.getUserEntity())
				.build();
		bodyAdiposityIndexEntity.setBodyAdiposityIndexResult(getResultOfIndex(bodyAdiposityIndexEntity));

		bodyAdiposityIndexRepository.save(bodyAdiposityIndexEntity);
	}

	private double getResultOfIndex(BodyAdiposityIndexEntity bodyAdiposityIndexEntity) {
		Double hipCircumference = bodyAdiposityIndexEntity.getHipCircumference();
		Integer userGrowth = bodyAdiposityIndexEntity.getUserGrowth();
		return (((100 * hipCircumference / (double) 100)
				/ ((userGrowth / (double) 100) * Math.sqrt(userGrowth / (double) 100))) - 18);
	}
}
