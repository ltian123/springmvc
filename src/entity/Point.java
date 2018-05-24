package entity;

import java.io.Serializable;

public class Point implements Serializable {
	private Double x;
	private Double y;
	public Point() {
		super();
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	
	
}
