/*
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @Author: your name
 * period: your period
 */

public class Fraction {

	// ****************** Instance variables ******************

	private int num; // numerator
	private int denom; // denominator

	public Fraction() {//Default Constructor that sets fraction to 0
		this.num = 0;
		this.denom = 1;
	}
	public Fraction(int n) {//Constructor that initializes the fraction tp n
		this.num = n;
		denom = 1;
	}
	public Fraction(int n, int d) {//Constructor that creates the new fraction
		this.num = n;
		this.denom = d;
		this.reduce();
	}
	public Fraction(Fraction other) {//Constructor that makes a copy of the given fraction
	 other.reduce();
	 this.num = other.num;
	 this.denom = other.denom;
	 	}
	
	public int getNumerator() {//Getter method for numerator
		return num;
	}
	public int getDenominator() {//Getter method for denominator
		return denom;
	}
	public double getValue() { //Getter method for decimal value of fraction
		return (double) getNumerator() / getDenominator();
	}
	public void setNumerator(int n) {//Setter method for numerator
		this.num = n;
	}
	public void setDenominator(int d) {//Setter method for denominator
		this.denom = d;
	}
	public void setFraction(Fraction other) {//Setter method for copy of fraction
		this.setFraction(other);
		
	}
	
	public Fraction add(Fraction other) {//Method to add this fraction and other fraction
	   
	   int n = num * other.denom + other.num * denom;
    int d = denom * other.denom;
    return new Fraction(n, d);
    

	}
	public Fraction add(int m) {//Method to add integer m to this fraction
		int n = (m * this.denom) + this.num;
		int d = this.denom;
		return new Fraction(n, d);
		
	} 
	public Fraction multiply(Fraction other) {//method to multiply this fraction to other fraction
	   
	 int n = num * other.num ;
    int d = denom * other.denom;
    this.reduce();
    return new Fraction(n, d);
		
	}
	public Fraction multiply(int m) {//method to multiply integer m to this fraction
	   
		int n = m * this.num;
		int d = this.denom;
		return new Fraction(n, d);
		
	}
	
	public void reduce() {//method to reduce fraction
	   
   	if (denom < 0) {
		num = -num;
		denom = -denom;
		}
	
	  int gcf= MyMathLib.gcf(Math.abs(num), Math.abs(denom));
	  num = num/gcf;
	  denom = denom/gcf;
   

		
	    

	}
	
	public String toString() {//Method to output fraction in desired format
		 return num + "/" + denom;
	}

}
