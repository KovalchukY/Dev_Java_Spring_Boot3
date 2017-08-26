package kovalchuk.service;

import java.util.List;

import kovalchuk.model.request.OwnerRequest;
import kovalchuk.model.view.OwnerView;

public interface OwnerService {
	
    List<OwnerView> findAllView();
	
	void save(OwnerRequest request);

	void delete(Integer id);

	OwnerRequest findOne(Integer id);
}
