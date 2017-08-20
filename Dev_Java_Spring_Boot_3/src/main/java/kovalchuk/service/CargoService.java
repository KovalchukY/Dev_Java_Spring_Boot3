package kovalchuk.service;

import java.util.List;

import kovalchuk.entity.Cargo;
import kovalchuk.model.view.CargoView;

public interface CargoService {

    List<String> findAllGoods();
	
	List<String> findAllCity();
	
	List<CargoView> findAllView();
	
	void save(Cargo cargo);

	void delete(Integer id);
	
}
