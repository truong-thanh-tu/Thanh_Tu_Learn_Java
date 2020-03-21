package learn_java;

public class Main {
	public static void main(String[] args) {
		Fraction fractionA = new Fraction(1, 9);
		Fraction fractionB = new Fraction(6, 8);
		
//		System.out.println(fractionB.print());
//		System.out.println(fractionA.print());
//		System.out.println(fractionA.UCLN(3, 4));
		
		System.out.println("Phan so toi gian");
		fractionA.normalize();
		System.out.println(fractionA.print());
	}
}
