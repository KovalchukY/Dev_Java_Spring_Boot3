package kovalchuk.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kovalchuk.entity.Model;
import kovalchuk.repository.ModelRepository;
import kovalchuk.service.ModelService;

@Service
public class ModelServiceImpl extends CrudServiceImpl<Model, Integer> implements ModelService {

	private final ModelRepository repository;
	
	@Autowired
	ModelServiceImpl(ModelRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Override
	public Model findByName(String name) {
		return repository.findByName(name);
	}
}
