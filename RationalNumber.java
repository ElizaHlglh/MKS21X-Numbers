public class RationalNumber extends RealNumber{

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

}
