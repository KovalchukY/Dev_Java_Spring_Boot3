package kovalchuk.model.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import kovalchuk.entity.Brand;
import kovalchuk.entity.City;
import kovalchuk.entity.Model;
import kovalchuk.entity.Status;

public class TransporterRequest {
	
	private Integer id;
		
	private String name;
	
	private BigDecimal rate;

	private int maxWeight;

	private String photoUrl;

	private int version;

	private int count;

	private int age;
	
	private String phone;
	
	private Brand brand;
	
	private Model model;

	private int carAge;
	
	private City cityArrive;

	private LocalDateTime dateArrive;
	
	private Status status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public int getCarAge() {
		return carAge;
	}

	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}

	public City getCityArrive() {
		return cityArrive;
	}

	public void setCityArrive(City cityArrive) {
		this.cityArrive = cityArrive;
	}

	public LocalDateTime getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(LocalDateTime dateArrive) {
		this.dateArrive = dateArrive;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
