package kovalchuk.service;

import java.util.List;

import kovalchuk.entity.Owner;
import kovalchuk.model.view.OwnerView;

public interface OwnerService {
	
List<OwnerView> findAllView();
	
	void save(Owner owner);

	void delete(Integer id);

}
