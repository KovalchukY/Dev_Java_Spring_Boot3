package kovalchuk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kovalchuk.entity.Brand;
import kovalchuk.repository.BrandRepository;
import kovalchuk.service.BrandService;

@Service
public class BrandServiceImpl extends CrudServiceImpl<Brand, Integer> implements BrandService {

	private final BrandRepository repository;
	
	@Autowired
	BrandServiceImpl(BrandRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Override
	public Brand findByName(String name) {
		return repository.findByName(name);
	}
}
