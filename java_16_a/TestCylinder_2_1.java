package java_16;

public class TestCylinder_2_1 {
	  public static void main(String[] args) {
	      Cylinder_2_1 cy1 = new Cylinder_2_1();
	     
	      System.out.println("Radius is " + cy1.getRadius()
	         + ", Height is " + cy1.getHeight()
	         + ", Color is " + cy1.getColor()
	         + ", Base area is " + cy1.getArea()
	         + ", Volume is " + cy1.getVolume());
	      

	      Cylinder_2_1 cy2 = new Cylinder_2_1(5.0, 2.0);
	     
	      System.out.println("Radius is " + cy2.getRadius()
	         + ", Height is " + cy2.getHeight()
	         + ", Color is " + cy2.getColor()
	         + ", Base area is " + cy2.getArea()
	         + ", Volume is " + cy2.getVolume());
	    
	   }
}
