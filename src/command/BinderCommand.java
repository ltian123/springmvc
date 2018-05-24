package command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import entity.Address;
import entity.Point;

public class BinderCommand {
	private String username;
	
	private Point point;
	
	private Point p;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	
	private Address address;
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
