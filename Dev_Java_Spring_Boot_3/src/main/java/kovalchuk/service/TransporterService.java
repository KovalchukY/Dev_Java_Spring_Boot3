package kovalchuk.service;

import java.util.List;

import kovalchuk.entity.Transporter;
import kovalchuk.model.view.TransporterView;


public interface TransporterService {

	    List<String> findAllBrand();
		
		List<String> findAllCity();
		
		List<String> findAllModel();
		
		List<TransporterView> findAllView();
		
		void save(Transporter transporter);

		void delete(Integer id);
}
