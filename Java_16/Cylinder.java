package Java_16;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		this.height = 1.0; 
	}
	public Cylinder(double radius) {
		this.radius = radius;
	}
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public Cylinder( double radius, double height, String color) {
		this.radius = radius;
		this.height = height;
		this.color  = color; 
	}
	public double getHeight() {
		return this.height;
	}
	public void  setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return this.height*this.radius*this.radius*Math.PI;
	}
	
	
	
}
