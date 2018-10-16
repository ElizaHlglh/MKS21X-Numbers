public class RationalNumber extends RealNumber{
/*
  private double deno;
  private double nume;

  public RationalNumber(RealNumber x, RealNumber y){
    nume = x.getNum();
    deno = y.getNum();
  }

  public double getNume() {
    return nume;
  }

  public double getDeno() {
    return deno;
  }

  public String toString() {
    if (deno == 0) {
      return "This number is undefined with a denominator of 0:" + nume + "/" + deno;
    }
    else if (deno == 1) {
      return "This number is a rational number with a denominator of one: " + nume + "/" + deno;
    }
    else if (nume == 0) {
      return "This number is zero with a numerator of 0:" + nume + "/" + deno;
    }
    else {
      return "Rational number:" + nume + "/" + deno;
    }
  }
  private boolean checkPositive() {
    if ((deno > 0 && nume > 0) || (deno < 0 && nume < 0)) {
      return true;
    }
    else {
      return false;
    }
  }

  public String compareTo(RealNumber x, RationalNumber y) {
    //check if the demo is zero or not
    if (y.getDeno() == 0) {
      return "Can't be compared because the rational nunmber is undefined.";
    }
    if ((x.getNum() * y.getDeno() > y.getNume()) && y.checkPositive()) {
      return x + " is greater than " + y;
    }
    else if ((x.getNum() * y.getDeno() < y.getNume()) && y.checkPositive()) {
      return y + " is greater than " + x;
    }
    else if ((x.getNum() * y.getDeno() == y.getNume()) && y.checkPositive()) {
      return y + " is equal to " + x;
    }
    else if ((x.getNum() * y.getDeno() < y.getNume()) && !y.checkPositive()) {
      return y + " is greater than " + x;
    }
    else {
      return null;
    }
  }

  public String compareTo(RealNumber x, RealNumber y) {
    if (x.getNum() > y.getNum()) {
      return x + " is greater than " + y;
    }
    else if (y.getNum() > x.getNum()) {
      return y + " is greater than " + x;
    }
    else {
      return x + " is equal to " + y;
    }
  }

  public String compareTo(RationalNumber x, RationalNumber y) {
    return null;
  }
*/

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
  }

  public double getValue(){
    return 0;//???
  }

/**
*@return the numerator
*/
public int getNumerator(){
 return 0;
}
/**
*@return the denominator
*/
public int getDenominator(){
 return 0;
}
/**
*@return a new RationalNumber that has the same numerator
*and denominator as this RationalNumber but reversed.
*/
public RationalNumber reciprocal(){
 return null;
}
/**
*@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
*/
public boolean equals(RationalNumber other){
 return false;
}


/**
*@return the value expressed as "3/4" or "8/3"
*/
public String toString(){
 return "0";
}



/**Calculate the GCD of two integers.
*@param a the first integers
*@param b the second integer
*@return the value of the GCD
*/
private static int gcd(int a, int b){
 /*use euclids method or a better one*/
 return 0;
}



/**
*Divide the numerator and denominator by the GCD
*This must be used to maintain that all RationalNumbers are
*reduced after construction.
*/
private void reduce(){

}



/******************Operations!!!!****************/


/**
*Return a new RationalNumber that is the product of this and the other
*/
public RationalNumber multiply(RationalNumber other){
 return null;
}

/**
*Return a new RationalNumber that is the this divided by the other
*/
public RationalNumber divide(RationalNumber other){
 return null;
}

/**
*Return a new RationalNumber that is the sum of this and the other
*/
public RationalNumber add(RationalNumber other){
 return null;
}
/**
*Return a new RationalNumber that this minus the other
*/
public RationalNumber subtract(RationalNumber other){
 return null;
}
}
