package kovalchuk.service;

import java.util.List;

import kovalchuk.model.request.CargoRequest;
import kovalchuk.model.view.CargoView;

public interface CargoService {

    List<String> findAllGoods();
	
	List<String> findAllCity();
	
	List<CargoView> findAllView();
	
	void save(CargoRequest request);

	void delete(Integer id);

	CargoRequest findOne(Integer id);
	
}
