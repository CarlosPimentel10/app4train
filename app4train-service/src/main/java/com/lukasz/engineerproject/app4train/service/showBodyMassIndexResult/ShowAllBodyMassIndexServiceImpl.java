package com.lukasz.engineerproject.app4train.service.showBodyMassIndexResult;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lukasz.engineerproject.app4train.model.entity.BodyMassIndex;
import com.lukasz.engineerproject.app4train.repository.getBodyMassIndexResult.ShowAllBodyMassIndexRepository;

@Service
public class ShowAllBodyMassIndexServiceImpl implements ShowAllBodyMassIndexService {

	@Autowired
	private ShowAllBodyMassIndexRepository bodyMassIndexRepository;

	public List<BodyMassIndex> getAllBodyMassIndex() {
		return bodyMassIndexRepository.getAllBodyMassIndex();
	}
}
