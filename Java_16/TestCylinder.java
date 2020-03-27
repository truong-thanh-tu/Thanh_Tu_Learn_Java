package Java_16;

public interface TestCylinder {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		System.out.println("Cylinder :"
				+ " radius = " + c1.getRadius()
				+ " height = " + c1.getHeight()
				+ " base area = "+ c1.getAre()
				+ " volume = "+ c1.getVolume());
		
		Cylinder c2 = new Cylinder(10.0);
		
		System.out.println("Cylinder :"
				+ " radius = " + c2.getRadius()
				+ " height = " + c2.getHeight()
				+ " base area = "+ c2.getAre()
				+ " volume = "+ c2.getVolume());
		
		
		Cylinder c3 = new Cylinder(2.0,10.0);
		
		System.out.println("Cylinder :"
				+ " radius = " + c3.getRadius()
				+ " height = " + c3.getHeight()
				+ " base area = "+ c3.getAre()
				+ " volume = "+ c3.getVolume());
		
	}
}
