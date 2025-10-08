package fraction;

public class Fraction {
  public Integer numerator;
  public Integer denominator;

  public Fraction(Integer numerator, Integer denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction addFraction(Fraction fraction1, Fraction fraction2) {
    Integer commonDenominator = fraction1.denominator * fraction2.denominator;
    Integer numerator = fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator;
    return new Fraction(numerator, commonDenominator);
  }
}
