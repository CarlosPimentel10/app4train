package com.lukasz.engineerproject.app4train.service.bmi.BmiServiceImpl;

import com.lukasz.engineerproject.app4train.repository.bmi.BodyMassIndexRepository;
import com.lukasz.engineerproject.app4train.service.bmi.RemoveBodyMassIndexService;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.BodyMassIndexEntity;

@Service
public class RemoveBodyMassIndexServiceImpl implements RemoveBodyMassIndexService {

	private final BodyMassIndexRepository bodyMassIndexRepository;

	public RemoveBodyMassIndexServiceImpl(BodyMassIndexRepository bodyMassIndexRepository) {
		this.bodyMassIndexRepository = bodyMassIndexRepository;
	}

	public void removeBodyMassIndex(BodyMassIndexEntity bodyMassIndexEntity) {
		bodyMassIndexRepository.delete(bodyMassIndexEntity);
	}
}
