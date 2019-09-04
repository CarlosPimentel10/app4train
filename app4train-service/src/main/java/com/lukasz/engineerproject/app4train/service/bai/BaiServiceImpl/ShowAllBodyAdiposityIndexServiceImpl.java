package com.lukasz.engineerproject.app4train.service.bai.BaiServiceImpl;

import java.util.List;

import com.lukasz.engineerproject.app4train.service.bai.ShowAllBodyAdiposityIndexService;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.domain.BodyAdiposityIndexEntity;
import com.lukasz.engineerproject.app4train.repository.bai.BodyAdiposityIndexRepository;

@Service
public class ShowAllBodyAdiposityIndexServiceImpl implements ShowAllBodyAdiposityIndexService {

	private final BodyAdiposityIndexRepository bodyAdiposityIndexRepository;

	public ShowAllBodyAdiposityIndexServiceImpl(BodyAdiposityIndexRepository bodyAdiposityIndexRepository) {
		this.bodyAdiposityIndexRepository = bodyAdiposityIndexRepository;
	}

	public List<BodyAdiposityIndexEntity> getAllBodyAdiposityIndex() {
		return bodyAdiposityIndexRepository.getAllBodyAdiposityIndex();
	}
}
