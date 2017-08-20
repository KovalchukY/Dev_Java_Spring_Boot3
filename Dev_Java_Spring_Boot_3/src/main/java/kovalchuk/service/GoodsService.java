package kovalchuk.service;

import kovalchuk.entity.Goods;

public interface GoodsService extends CrudService<Goods, Integer> {

	Goods findByName(String name);
}
