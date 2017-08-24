package kovalchuk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kovalchuk.entity.Owner;
import kovalchuk.model.view.OwnerView;

public interface OwnerRepository extends JpaNameRepository<Owner, Integer> {
	
	
	@Query("SELECT new kovalchuk.model.view.OwnerView(o.id, o.name, o.phone, o.count, o.address) FROM Owner o")
	List<OwnerView> findAllView();
}


