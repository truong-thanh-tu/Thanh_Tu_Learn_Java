package Java_15;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(int x, int y ) {
		this.x = x;
		this.y = y;
	}
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
	public int[] getXY() {
		 int[] array = new int[2];
		 array[0] = this.x;
		 array[1] = this.y;
		 return array;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		int xD = this.x - x;
		int yD = this.y - y;
		return Math.sqrt(xD*xD +yD*yD);
	}
	public double distance(MyPoint another) {
		int xD = this.x - another.x;
		int yD = this.y - another.y;
		return Math.sqrt(xD*xD +yD*yD);
	}
	public double distance() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
}
