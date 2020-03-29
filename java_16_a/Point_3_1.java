package java_16;

import java.awt.Point;

public class Point_3_1 {
	private int x;
	private int y;
	
	public Point_3_1() {
		super();
	}

	public Point_3_1(int x, int y) {
		super();
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
	public void setY( int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point_3_1 [x=" + x + ", y=" + y + "]";
	}
	public void setXY(int x, int y) {
		this.y = y;
		this.x = x;
	}
	public int[] getXY() {
		int[] arr = new int[2];
		arr[1] = this.x;
		arr[0] = this.y;
		return arr;
	}
	public double distance(int x, int y) {
		int xDiff = this.x-x;
		int yDiff = this.y-y;
		return Math.sqrt(xDiff*xDiff +yDiff*xDiff);
	}
	public double distance(Point_3_1 another) {
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff +yDiff*xDiff);
	}
	public double distance() {
		return Math.sqrt(this.x*this.x +this.y*this.y);
	}
}
