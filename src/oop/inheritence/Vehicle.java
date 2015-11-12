package oop.inheritence;

public class Vehicle {

	private String	color;
	public int		speed;
	protected int	size;

	public Vehicle( ) {

	}

	public Vehicle( String color, int speed, int size ) {
		this.color = color;
		this.speed = speed;
		this.size = size;
	}

	public String getColor( ) {
		return color;
	}

	public void setColor( String color ) {
		this.color = color;
	}

	public void setVehicleProp( String color, int speed, int size ) {
		this.color = color;
		this.speed = speed;
		this.size = size;
	}

}
