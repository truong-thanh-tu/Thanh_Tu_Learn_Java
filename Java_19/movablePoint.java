package Abstract_Classes_vs_Interfaces;

public class movablePoint implements Movable {
	 private int x, y;   // x and y coordinates of the point
     
	   /** Constructs a MovablePoint instance at the given x and y */
	   public movablePoint(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   /** Returns a self-descriptive string */ 
	   @Override
	   public String toString() {
	      return "(" + x + "," + y + ")";
	   }

	   // Need to implement all the abstract methods defined in the interface Movable
	   @Override
	   public void moveUp() {
	      y--;
	   }
	   @Override
	   public void moveDown() {
	      y++;
	   }
	   @Override
	   public void moveLeft() {
	      x--;
	   }
	   @Override
	   public void moveRight() {
	      x++;
	   }
}
