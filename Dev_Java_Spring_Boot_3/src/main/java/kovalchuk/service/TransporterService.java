package kovalchuk.service;

import java.util.List;

import kovalchuk.model.request.TransporterRequest;
import kovalchuk.model.view.TransporterView;


public interface TransporterService {

	    List<String> findAllBrand();
		
		List<String> findAllCity();
		
		List<String> findAllModel();
		
		List<TransporterView> findAllView();
		
		void save(TransporterRequest request);

		void delete(Integer id);

		TransporterRequest findOne(Integer id);
}
