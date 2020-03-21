package learn_java;

public class Fraction {
	private int  numertor;
	private int denomirator;
	
	public Fraction(int numetor, int denominator) {
		this.numertor    = numetor;
		this.denomirator = denominator;
	}
	public Fraction (Fraction fractionA,Fraction fractionB,String operator) {
		
	}
	public String print() {
		
		return this.getNumerator() + "/"+this.getDenominator();
	}
	
	public void add (Fraction fractionA, Fraction fractionB) {
		
	}
	public void sub(Fraction fractionA,Fraction fractionB) {
		
	}
	public void multiply(Fraction fractionA, Fraction fractionB) {
		
	}
	public void divide(Fraction fractionnA, Fraction fractionB) {
		
	}
	private int UCLN(int x, int y) {
		int result = Math.min(x, y);
		while (result >= 1) {
			if(x % result == 0 && y % result == 0 )  return result;
			result--;
		}
		return result;
	}
	public boolean checkNormalize() {
		if(this.UCLN(this.getNumerator(), this.getDenominator()) == 1) return true;
		return false;
	}
	public void normalize() {
		if(this.checkNormalize() == false) {
		   int ucln = this.UCLN(this.getNumerator(), this.getDenominator());
	       this.setNumerator( this.getNumerator() / ucln);
		   this.setDenominator( this.getDenominator() /ucln);
	 }
	}
	public int getNumerator() {
		return numertor;
	}
	public void setNumerator( int numerator) {
		this.numertor = numerator;
	}
	public int getDenominator() {
		return denomirator;
	}
	public void setDenominator(int denominator) {
		this.denomirator = denominator;
	}
}
