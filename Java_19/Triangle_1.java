package Abstract_Classes_vs_Interfaces;

public class Triangle_1 implements Shape_1{
	 private int base, height;

	   /** Constructs a Triangle instance with the given base and height */
	   public Triangle_1(int base, int height) {
	      this.base = base;
	      this.height = height;
	   }

	   /** Returns a self-descriptive string */
	   @Override
	   public String toString() {
	      return "Triangle[base=" + base + ",height=" + height + "]";
	   }

	   // Need to implement all the abstract methods defined in the interface
	   /** Returns the area of this triangle */
	   @Override
	   public double getArea() {
	      return 0.5 * base * height;
	   }
}
