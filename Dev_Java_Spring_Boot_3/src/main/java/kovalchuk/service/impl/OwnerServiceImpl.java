package kovalchuk.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import kovalchuk.entity.Owner;
import kovalchuk.model.view.OwnerView;
import kovalchuk.repository.OwnerRepository;
import kovalchuk.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {

	private final OwnerRepository repository;
	
	public OwnerServiceImpl(OwnerRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<OwnerView> findAllView() {
		return repository.findAllView();
	}

	@Override
	public void save(Owner owner) {
		repository.save(owner);
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
	}

}
