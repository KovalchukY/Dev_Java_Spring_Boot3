package kovalchuk.service.impl;

import org.springframework.stereotype.Service;

import kovalchuk.entity.City;
import kovalchuk.repository.CityRepository;
import kovalchuk.service.CityService;

@Service
public class CityServiceImpl extends CrudServiceImpl<City, Integer> implements CityService {
	
    private final CityRepository repository;
	
	public CityServiceImpl(CityRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Override
	public City findByName(String name) {
		return repository.findByName(name);
	}

}
