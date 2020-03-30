package java_18;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Cylinder(1.1, 2.2);
		System.out.println(c1.getRadius());
//		// CANNOT invoke method in Cylinder as c1 is a Circle reference
//		c1.getHeight();
//		//compilation error: cannot find symbol method getHeight()
//		c1.getVolume();
//		//compilation error: cannot find symbol method getVolume()
		
		System.out.println(c1.toString());  // Run the overridden version
		//Cylinder[height=1.1,Circle[radius=2.2]]
		System.out.println(c1.getArea());   // Run the overridden version
		//15.205308443374602
	}
}
