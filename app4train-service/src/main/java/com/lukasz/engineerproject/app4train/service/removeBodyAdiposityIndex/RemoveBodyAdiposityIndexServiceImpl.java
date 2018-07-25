package com.lukasz.engineerproject.app4train.service.removeBodyAdiposityIndex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.repository.removeBodyAdiposityIndex.RemoveBodyAdiposityIndexRepository;

@Service
public class RemoveBodyAdiposityIndexServiceImpl implements RemoveBodyAdiposityIndexService {

	@Autowired
	private RemoveBodyAdiposityIndexRepository removeBodyAdiposityIndexRepository;

	public void removeBodyAdiposityIndex(BodyAdiposityIndex bodyAdiposityIndex) {
		removeBodyAdiposityIndexRepository.delete(bodyAdiposityIndex);
	}
}
