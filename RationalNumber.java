public class RationalNumber extends RealNumber{

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return numerator/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }
/**
*@return a new RationalNumber that has the same numerator
*and denominator as this RationalNumber but reversed.
*/
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
/**
*@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
*/
  public boolean equals(RationalNumber other){
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }


/**
*@return the value expressed as "3/4" or "8/3"
*/
  public String toString(){
    return numerator + "/" + denominator;
  }



/**Calculate the GCD of two integers.
*@param a the first integers
*@param b the second integer
*@return the value of the GCD
*/
  private static int gcd(int a, int b){
 /*use euclids method or a better one*/
  int factor = 1;
  for (int i = 1; i <= a && i <= b; i++){
    if (a % i == 0 && b % i == 0){
      factor = i;
    }
  }
    return factor;
  }



/**
*Divide the numerator and denominator by the GCD
*This must be used to maintain that all RationalNumbers are
*reduced after construction.
*/
  private void reduce(){
    int factor = gcd(numerator, denominator);
    numerator = numerator/factor;
    denominator = denominator/factor;
  }



/******************Operations!!!!****************/


/**
*Return a new RationalNumber that is the product of this and the other
*/
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

/**
*Return a new RationalNumber that is the this divided by the other
*/
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(other.getNumerator() * denominator, other.getDenominator() * numerator);
  }

/**
*Return a new RationalNumber that is the sum of this and the other
*/
  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() + other.getNumerator() * denominator, other.getDenominator() * denominator);
  }
/**
*Return a new RationalNumber that this minus the other
*/
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator() - other.getNumerator() * denominator, other.getDenominator() * denominator);
  }
}
