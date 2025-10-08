package fraction;

import org.junit.Assert;

public class Test {

  @org.junit.Test
  public void test() {
    Fraction fraction1 = new Fraction(1, 2);
    Fraction fraction2 = new Fraction(2, 3);
    Fraction fraction3 = new Fraction(7, 6);
    Assert.assertEquals(fraction3, fraction1.addFraction(fraction1, fraction2));
  }
}
