package com.lukasz.engineerproject.app4train.service.showBodyAdiposityIndexResult;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyAdiposityIndex;
import com.lukasz.engineerproject.app4train.repository.getBodyAdiposityIndexResult.ShowAllBodyAdiposityIndexRepository;

@Service
public class ShowAllBodyAdiposityIndexServiceImpl implements ShowAllBodyAdiposityIndexService {

	@Autowired
	private ShowAllBodyAdiposityIndexRepository bodyAdiposityIndexRepository;

	public List<BodyAdiposityIndex> getAllBodyAdiposityIndex() {
		return bodyAdiposityIndexRepository.getAllBodyAdiposityIndex();
	}
}
