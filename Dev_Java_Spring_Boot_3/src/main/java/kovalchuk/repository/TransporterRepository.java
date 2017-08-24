package kovalchuk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kovalchuk.entity.Transporter;
import kovalchuk.model.view.TransporterView;


public interface TransporterRepository extends JpaNameRepository<Transporter, Integer> {
	
	@Query("SELECT b.name FROM Brand b")
	List<String> findAllBrand();

	@Query("SELECT c.name FROM City c")
	List<String> findAllCity();

	@Query("SELECT m.name FROM Model m")
	List<String> findAllModel();
	
	@Query("SELECT new kovalchuk.model.view.TransporterView(t.rate, t.maxWeight, t.photoUrl, t.version, t.name, t.count, t.age, t.phone, b.name, m.name, t.carAge, cArrive.name) FROM Transporter t JOIN t.brand b JOIN t.model m JOIN t.cityArrive cArrive")
	List<TransporterView> findAllView();



}
