package com.lukasz.engineerproject.app4train.service.bai.BaiServiceImpl;

import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import com.lukasz.engineerproject.app4train.repository.bai.BodyAdiposityIndexRepository;
import com.lukasz.engineerproject.app4train.service.bai.RemoveBodyAdiposityIndexService;
import org.springframework.stereotype.Service;

@Service
public class RemoveBodyAdiposityIndexServiceImpl implements RemoveBodyAdiposityIndexService {

	private final BodyAdiposityIndexRepository bodyAdiposityIndexRepository;

	public RemoveBodyAdiposityIndexServiceImpl(BodyAdiposityIndexRepository bodyAdiposityIndexRepository) {
		this.bodyAdiposityIndexRepository = bodyAdiposityIndexRepository;
	}

	public void removeBodyAdiposityIndex(BodyAdiposityIndexEntity bodyAdiposityIndexEntity) {
		bodyAdiposityIndexRepository.delete(bodyAdiposityIndexEntity);
	}
}
