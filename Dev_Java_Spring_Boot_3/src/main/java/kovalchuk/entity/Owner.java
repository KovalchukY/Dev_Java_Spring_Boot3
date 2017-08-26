package kovalchuk.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner extends AbstractEntityName{

	public Owner() {
	}
	
	public Owner(String name) {
		super(name);
	}
	
	public Owner(String phone, int count, String address) {
		this.phone = phone;
		this.count = count;
		this.address = address;
	}

	private String phone;
	
	@Column(name="_count")
	private int count;
	
	private String address;
	
	@OneToMany(mappedBy="owner")
	private List<Cargo> cargos = new ArrayList<>();

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int string) {
		this.count = string;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
}
