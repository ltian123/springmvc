package entity;

import java.io.Serializable;

public class Address implements Serializable {
	private String province;
	private String city;
	public Address() {
		super();
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
