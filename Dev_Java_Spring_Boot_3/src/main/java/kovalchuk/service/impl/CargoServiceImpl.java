package kovalchuk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import kovalchuk.entity.Cargo;
import kovalchuk.model.view.CargoView;
import kovalchuk.repository.CargoRepository;
import kovalchuk.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService {

	private final CargoRepository repository;
	
	public CargoServiceImpl(CargoRepository repository) {
	this.repository = repository;
	}

	@Override
	public List<String> findAllGoods() {
		return repository.findAllGoods();
	}

	@Override
	public List<String> findAllCity() {
		return repository.findAllCity();
	}

	@Override
	public List<CargoView> findAllView() {
		return repository.findAllView();
	}

	@Override
	public void save(Cargo cargo) {
		repository.save(cargo);
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
	}
	
}
