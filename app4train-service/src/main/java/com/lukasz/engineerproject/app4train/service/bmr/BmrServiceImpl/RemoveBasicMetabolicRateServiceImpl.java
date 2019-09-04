package com.lukasz.engineerproject.app4train.service.bmr.BmrServiceImpl;

import com.lukasz.engineerproject.app4train.repository.bmr.BasicMetabolicRateRepository;
import com.lukasz.engineerproject.app4train.service.bmr.RemoveBasicMetabolicRateService;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;

@Service
public class RemoveBasicMetabolicRateServiceImpl implements RemoveBasicMetabolicRateService {

	private final BasicMetabolicRateRepository basicMetabolicRateRepository;

	public RemoveBasicMetabolicRateServiceImpl(BasicMetabolicRateRepository basicMetabolicRateRepository) {
		this.basicMetabolicRateRepository = basicMetabolicRateRepository;
	}

	public void removeBasicMetabolicRate(BasicMetabolicRateEntity basicMetabolicRateEntity) {
		basicMetabolicRateRepository.delete(basicMetabolicRateEntity);
	}
}
