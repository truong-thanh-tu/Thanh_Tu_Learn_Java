package Abstract_Classes_vs_Interfaces;

public class Traingle extends Shape{
	private int base;
	private int height;
	

	public Traingle (int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}
	
	public double getArea() {
		return height*base/2;
	}
	@Override
	public String toString() {
		return "Traingle  [height=" + height + ", base=" + base + "]";
	}
}
