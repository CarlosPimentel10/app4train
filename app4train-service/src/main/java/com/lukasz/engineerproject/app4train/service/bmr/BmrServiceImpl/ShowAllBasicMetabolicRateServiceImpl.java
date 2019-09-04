package com.lukasz.engineerproject.app4train.service.bmr.BmrServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.BasicMetabolicRateEntity;
import com.lukasz.engineerproject.app4train.repository.bmr.BasicMetabolicRateRepository;
import com.lukasz.engineerproject.app4train.service.bmr.ShowAllBasicMetabolicRateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowAllBasicMetabolicRateServiceImpl implements ShowAllBasicMetabolicRateService {

	private final BasicMetabolicRateRepository basicMetabolicRateRepository;

	public ShowAllBasicMetabolicRateServiceImpl(BasicMetabolicRateRepository basicMetabolicRateRepository) {
		this.basicMetabolicRateRepository = basicMetabolicRateRepository;
	}

	public List<BasicMetabolicRateEntity> getAllBasicMetabolicRate() {
		return basicMetabolicRateRepository.getAllBasicMetabolicRate();
	}
}
