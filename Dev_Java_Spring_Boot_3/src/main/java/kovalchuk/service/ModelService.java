package kovalchuk.service;

import kovalchuk.entity.Model;

public interface ModelService extends CrudService<Model, Integer> {

	Model findByName(String name);

}
