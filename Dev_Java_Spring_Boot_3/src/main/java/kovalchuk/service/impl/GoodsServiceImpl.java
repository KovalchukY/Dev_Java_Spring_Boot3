package kovalchuk.service.impl;

import org.springframework.stereotype.Service;

import kovalchuk.entity.Goods;
import kovalchuk.repository.GoodsRepository;
import kovalchuk.service.GoodsService;

@Service
public class GoodsServiceImpl extends CrudServiceImpl<Goods, Integer> implements GoodsService {

	private final GoodsRepository repository;
	
	public GoodsServiceImpl(GoodsRepository repository) {
		super(repository);
		this.repository = repository;
	}

	@Override
	public Goods findByName(String name) {
		return repository.findByName(name);
	}
}
