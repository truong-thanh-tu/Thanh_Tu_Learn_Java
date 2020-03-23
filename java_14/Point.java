package java_14;

  public class Point {
	private int x= 0;
	private int y = 0;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
    }
	public String toString() {
		return "( "+this.x+","+this.y+" )";
	}
	public int[] getXY() {
		int[] myArray = new int[2];
		myArray[0] = this.x;
		myArray[1] = this.y;
		return myArray;
	}
	public void setXY(int x,int y ){
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		int xDiff = this.x -x;
		int yDiff = this.y -y;
		return Math.sqrt(xDiff*yDiff+yDiff*yDiff);
	}
	public double distance(Point another) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
	}
	public double distance() {
		return Math.sqrt(this.x*this.x +this.y*this.y);
	}
}
