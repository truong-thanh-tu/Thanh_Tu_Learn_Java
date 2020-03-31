package Abstract_Classes_vs_Interfaces;

public class Rectangle extends Shape {
	private int length;
	private int with;
	public Rectangle() {
		super();
		this.length = 1;
		this.with = 2;
	}
	public Rectangle(int length, int with) {
		super();
		this.length = length;
		this.with = with;
	}
	
	public double getArea() {
		return 2*length*with;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", with=" + with + "]";
	}
	
	
}
