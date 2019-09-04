package com.lukasz.engineerproject.app4train.service.bmi.BmiServiceImpl;

import java.util.List;

import com.lukasz.engineerproject.app4train.service.bmi.ShowAllBodyMassIndexService;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;
import com.lukasz.engineerproject.app4train.repository.bmi.BodyMassIndexRepository;

@Service
public class ShowAllBodyMassIndexServiceImpl implements ShowAllBodyMassIndexService {

	private final BodyMassIndexRepository bodyMassIndexRepository;

	public ShowAllBodyMassIndexServiceImpl(BodyMassIndexRepository bodyMassIndexRepository) {
		this.bodyMassIndexRepository = bodyMassIndexRepository;
	}

	public List<BodyMassIndexEntity> getAllBodyMassIndex() {
		return bodyMassIndexRepository.getAllBodyMassIndex();
	}
}
