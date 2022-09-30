package oops1;

public class Fraction1 {
	private int numerator;
	private int denominator;
	
	public Fraction1(int i, int j) {
		this.numerator = i;
		this.denominator = j;
	}
	
	
	
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}




	public void print() {
		System.out.println(numerator + "/" + denominator);
		
	}




	public void symplify() {
		int hcf = 1;
		for(int i=2; i<=numerator && i<=denominator; i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				hcf = i;
			}
		}
		numerator = numerator/hcf;
		denominator = denominator/hcf;
		
	}
	
	
}
