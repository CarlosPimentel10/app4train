package com.lukasz.engineerproject.app4train.service.removeBasicMetabolicRate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.repository.removeBasicMetabolicRate.RemoveBasicMetabolicRateRepository;

@Service
public class RemoveBasicMetabolicRateServiceImpl implements RemoveBasicMetabolicRateService {

	@Autowired
	private RemoveBasicMetabolicRateRepository removeBasicMetabolicRateRepository;

	public void removeBasicMetabolicRate(BasicMetabolicRate basicMetabolicRate) {
		removeBasicMetabolicRateRepository.delete(basicMetabolicRate);
	}
}
