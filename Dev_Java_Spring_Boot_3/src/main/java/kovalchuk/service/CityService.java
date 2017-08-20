package kovalchuk.service;

import kovalchuk.entity.City;

public interface CityService extends CrudService<City, Integer> {

	City findByName(String name);
}
