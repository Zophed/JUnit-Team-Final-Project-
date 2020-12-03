/*
 * Team 10:
 * Anthony Onstott
 * Nathan Nelson
 * Carl Painter
 * Zachary Riggle
 */

/*
 * This file the basis for the two test files. It contains all the methods necessary to create
 * 		new fraction object, perform fraction addition and subtraction; it also provides methods
 * 		for comparing fractions, pulling the included data variables from a fraction object, and 
 * 		provides methods that support the others for simplicity's sake.
 */

package fraction;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction(int num, int den){
		if(den == 0)
			throw new IllegalArgumentException("The denominator with the value of 0 is not permitted");
		if(num < 0 && den < 0) {
			this.num = -num;
			this.den = -den;
		}else if(num < 0 && den > 0){
			this.num = num;
			this.den = den;
		}else if(num >= 0 && den < 0) {
			this.num = -num;
			this.den = -den;
		}else {
			this.num = num;
			this.den = den;
		}
		reduce();
	}
	
	public Fraction add(Fraction test) {
		if(test == null)
			throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!");
		
		int nRes = (this.getNum() * test.getDen()) + (test.getNum() * this.getDen());
		int dRes = (this.getDen() * test.getDen());
		Fraction res = new Fraction(nRes, dRes);
		res.reduce();
		return res;
	}
	
	public Fraction multiply(Fraction test) {
		if(test == null)
			throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!");
		
		int nRes = this.getNum() * test.getNum();
		int dRes = this.getDen() * test.getDen();
		
		Fraction res = new Fraction(nRes, dRes);
		res.reduce();
		return res;
	}
	
	public int getNum() {return this.num;}
	public int getDen() {return this.den;}
	
	public boolean equals(Fraction test) {
		test.reduce();
		this.reduce();
		if(test.getNum() == this.getNum() && test.getDen() == this.getDen())
			return true;
		else
			return false;
	}
	public int compareTo(Fraction test) {
		double x = test.realValue();
		double y = this.realValue();
		
		if(x > y)
			return -1;
		else if(x == y)
			return 0;
		else
			return 2;
	}
	
	public double realValue() {
		double res = ((double)this.getNum() / (double)this.getDen());
		return res;
		
	}
	
	public String toString() {  
		return this.getNum() + "/" + this.getDen();
	}
	
	/*Supporting methods */
	
	public int calculateGCD(int num, int den) {
		if(num % den == 0)
			return den;
		return calculateGCD(den, num % den);
	}
	
	public void reduce() {
		int gcd = calculateGCD(num, den);
		if(gcd < 0)
			gcd /= -1;
		
		num /= gcd;
		den /= gcd;
	}
	
}
