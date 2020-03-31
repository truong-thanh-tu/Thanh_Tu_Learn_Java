package Abstract_Classes_vs_Interfaces;


public class Rectangle_1 implements Shape_1 {
	private int length, width;
	
	public Rectangle_1(int length, int width) {
		this.length = length;
		this.width =width;
	}
	
	  @Override
	   public String toString() {
	      return "Rectangle[length=" + length + ",width=" + width + "]";
	   }
	  
	  @Override
	   public double getArea() {
	      return length * width;
	   }
}
