package java_14;

public class TestLine {
	public static void main(String[] args) {
		Line l1 = new Line(1,2,3,4);
		System.out.println(l1);
		Line l2 =new Line(new Point(5,6),new Point(7,8));
		System.out.println(l2);
		
		l1.setBegin(new Point(11,12));
		l1.setEnd(new Point(13,14));
		System.out.println(l1);
		System.out.println("Begin is : "+l1.getBegin());
		System.out.println("End is : "+l1.getEnd() );
		l1.setBeginX(21);
		l1.setBeginY(22);
		l1.setEndX(23);
		l1.setEndY(24);
		
		System.out.println(l1);
		System.out.println("Begin's x is: "+l1.getBeginX());
		System.out.println("Begin's y is: "+l1.getBeginY());
		System.out.println("End's x is: "+l1.getEndX());
		System.out.println("End's y is: "+l1.getEndY());
		
		l1.setBeginXY(31, 32);
		l1.setEndXY(33, 34);
		System.out.println(l1);
		System.out.println("Begin's x and y are: "+l1.toString());
		System.out.println("Begin's x and y are: "+l2.toString());
		
		System.out.printf("Lenght is : 5.2f%n",l1.getLength());
	}
}
