package java_16;

public class Circle_2_1 {
	// private instance variables
	private double radius;
	private String color;
	//constructors
	public Circle_2_1() {
		this.radius = 1.0;
		this.color  = "red"; 
		System.out.println("Construced a Circle with Circle()");//for debugging
	}
	public Circle_2_1(double radius) {
		this.color = "red";
		this.radius = radius;
		System.out.println("Construced a Circle with Circle(radius)");//for debugging
	}
	public Circle_2_1(double radius, String color) {
		this.color = color;
		this.radius = radius;
		System.out.println("Construced a Circle with Circle(radius, color)");// for debugging
	}
	// public getting and setters for the private variables
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//  Returns a self descriptive String
	public String toString() {
		return "Circle_2_1 [radius=" + radius + ", color=" + color + "]";
	}
	// Returns the area of this Circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
}
