package kovalchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kovalchuk.entity.Transporter;
import kovalchuk.model.view.TransporterView;
import kovalchuk.repository.TransporterRepository;
import kovalchuk.service.TransporterService;

@Service
public class TransporterServiceImpl implements TransporterService {

	    private final TransporterRepository repository;
	
		@Autowired
		TransporterServiceImpl(TransporterRepository repository) {
			this.repository = repository;
		}

		@Override
		public List<String> findAllBrand() {
			return repository.findAllBrand();
		}
		
		@Override
		public List<String> findAllCity() {
			return repository.findAllCity();
		}
		
		@Override
		public List<String> findAllModel() {
			return repository.findAllModel();
		}
		
		@Override
		public List<TransporterView> findAllView() {
			return repository.findAllView();
		}

		@Override
		public void save(Transporter transporter) {
			repository.save(transporter);
		}

		@Override
		public void delete(Integer id) {
			repository.delete(id);
		}
}
