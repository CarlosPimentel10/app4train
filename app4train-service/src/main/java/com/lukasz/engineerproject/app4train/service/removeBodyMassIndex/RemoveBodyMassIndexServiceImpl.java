package com.lukasz.engineerproject.app4train.service.removeBodyMassIndex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;
import com.lukasz.engineerproject.app4train.repository.removeBodyMassIndex.RemoveBodyMassIndexRepository;

@Service
public class RemoveBodyMassIndexServiceImpl implements RemoveBodyMassIndexService {

	@Autowired
	private RemoveBodyMassIndexRepository removeBodyMassIndexRepository;

	public void removeBodyMassIndex(BodyMassIndex bodyMassIndex) {
		removeBodyMassIndexRepository.delete(bodyMassIndex);
	}
}
