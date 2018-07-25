package com.lukasz.engineerproject.app4train.service.showBasicMetabolicRateResult;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BasicMetabolicRate;
import com.lukasz.engineerproject.app4train.repository.getBasicMetabolicRateResult.ShowAllBasicMetabolicRateRepository;

@Service
public class ShowAllBasicMetabolicRateServiceImpl implements ShowAllBasicMetabolicRateService {

	@Autowired
	private ShowAllBasicMetabolicRateRepository basicMetabolicRateRepository;

	public List<BasicMetabolicRate> getAllBasicMetabolicRate() {
		return basicMetabolicRateRepository.getAllBasicMetabolicRate();
	}
}
