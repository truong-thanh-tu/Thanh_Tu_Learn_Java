package java_16;

public class Point2D_2_9 {
	 private int x, y;

	   // Constructors
	  
	   public Point2D_2_9() {  // default constructor
	      this.x = 0;
	      this.y = 0;
	   }
	   /** Constructs a Point2D instance at the given (x,y) */
	   public Point2D_2_9(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   // Getters and Setters
	   public int getX() {
	      return this.x;
	   }
	   public void setX(int x) {
	      this.x = x;
	   }
	   public int getY() {
	      return this.y;
	   }
	   public void setY(int y) {
	      this.y = y;
	   }

	   // Returns a self-descriptive string in the form of "(x,y)"
	  
	   public String toString() {
	      return "(" + this.x + "," + this.y + ")";
	   }
}
