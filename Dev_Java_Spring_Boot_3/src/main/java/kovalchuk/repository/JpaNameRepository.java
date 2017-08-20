package kovalchuk.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import kovalchuk.entity.AbstractEntityName;

@NoRepositoryBean
public interface JpaNameRepository<T extends AbstractEntityName, ID extends Serializable> extends JpaRepository<T, ID> {

	T findByName(String name);
	
	boolean existsByName(String name);
}
