package kovalchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kovalchuk.entity.Transporter;
import kovalchuk.model.request.TransporterRequest;
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
		public void save(TransporterRequest request) {
			Transporter transporter = new Transporter();
			transporter.setId(request.getId());
			transporter.setName(request.getName());
			transporter.setRate(request.getRate());
			transporter.setMaxWeight(request.getMaxWeight());
			transporter.setPhotoUrl(request.getPhotoUrl());
			transporter.setVersion(request.getVersion());
			transporter.setCount(request.getCount());
			transporter.setAge(request.getAge());
			transporter.setPhone(request.getPhone());
			transporter.setBrand(request.getBrand());
			transporter.setModel(request.getModel());
			transporter.setCarAge(request.getCarAge());
			transporter.setCityArrive(request.getCityArrive());
			//transporter.setDateArrive(request.getDateArrive());
			//transporter.setStatus(request.getStatus());
			repository.save(transporter);
		}
		
		@Override
		public TransporterRequest findOne(Integer id) {
			Transporter transporter = repository.findOneRequest(id);
			TransporterRequest request = new TransporterRequest();
			request.setId(transporter.getId());
			request.setName(transporter.getName());
			request.setRate(transporter.getRate());
			request.setMaxWeight(transporter.getMaxWeight());
			request.setPhotoUrl(transporter.getPhotoUrl());
			request.setVersion(transporter.getVersion());
			request.setCount(transporter.getCount());
			request.setAge(transporter.getAge());
			request.setPhone(transporter.getPhone());
			request.setBrand(transporter.getBrand());
			request.setModel(transporter.getModel());
			request.setCarAge(transporter.getCarAge());
			request.setCityArrive(transporter.getCityArrive());
			//request.setDateArrive(transporter.getDateArrive());
			//request.setStatus(transporter.getStatus());
			return request;
		}

		@Override
		public void delete(Integer id) {
			repository.delete(id);
		}
}
