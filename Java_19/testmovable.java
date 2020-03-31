package Abstract_Classes_vs_Interfaces;

public class testmovable {
	public static void main(String[] args) {
		movablePoint p1 = new movablePoint(1, 2);
		System.out.println(p1);
		// (1,2)
		p1.moveDown();
		System.out.println(p1);
		// (1,3)
		p1.moveRight();
		System.out.println(p1);
		// (2,3)

		// Test Polymorphism
		Movable p2 = new movablePoint(3, 4); // upcast
		p2.moveUp();
		System.out.println(p2);
		// (3,3)

		movablePoint p3 = (movablePoint) p2; // downcast
		System.out.println(p3);
		// (3,3)
	}
}
