package kovalchuk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import kovalchuk.entity.Owner;
import kovalchuk.model.request.OwnerRequest;
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
	public void save(OwnerRequest request) {
		Owner owner = new Owner();
		owner.setName(request.getName());
		owner.setAddress(request.getAddress());
		owner.setCount(request.getCount());
		owner.setPhone(request.getPhone());
		owner.setId(request.getId());
		repository.save(owner);
	}
	
	@Override
	public OwnerRequest findOne(Integer id) {
		Owner owner = repository.findOneRequest(id);
		OwnerRequest request = new OwnerRequest();
		request.setName(owner.getName());
		request.setAddress(owner.getAddress());
		request.setCount(owner.getCount());
		request.setPhone(owner.getPhone());
		request.setId(owner.getId());
		return request;
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
	}
}
