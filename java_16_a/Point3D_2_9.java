package java_16;

public class Point3D_2_9 extends Point2D_2_9 {
	private int z;

	   // Constructors
	   /** Constructs a Point3D instance at (0,0,0) */
	   public Point3D_2_9() {  // default constructor
	      super();     // x = y = 0
	      this.z = 0;
	   }
	   /** Constructs a Point3D instance at (x,y,z) */
	   public Point3D_2_9(int x, int y, int z) {
	      super(x, y);
	      this.z = z;
	   }

	   // Getters and Setters
	   public int getZ() {
	      return this.z;
	   }
	   public void setZ(int z) {
	      this.z = z;
	   }

	   // Returns a self-descriptive string in the form of "(x,y,z)" */
	 
	   public String toString() {
	      return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
	   }
}
