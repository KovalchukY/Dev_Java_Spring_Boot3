package kovalchuk.service;

import kovalchuk.entity.Brand;

public interface BrandService extends CrudService<Brand, Integer> {
	
	 Brand findByName(String name);

}
