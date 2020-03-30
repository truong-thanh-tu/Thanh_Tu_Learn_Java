package java_18;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("red", 4, 5); 
		System.out.println(s1); 
		
		System.out.println("Area is " + s1.getArea()); // Run Rectangle's getArea()
		// Area is 20.0

		Shape s2 = new Triangle("blue", 4, 5); // Upcast
		System.out.println(s2); // Run Triangle's toString()
		// Triangle[base=4,height=5,Shape[color=blue]]
		System.out.println("Area is " + s2.getArea()); // Run Triangle's getArea()
		// Area is 10.0
		Shape s3 = new Shape("green");
		System.out.println(s3);
		// Shape[color=green]
		System.out.println("Area is " + s3.getArea()); // Invalid output
	}
}
