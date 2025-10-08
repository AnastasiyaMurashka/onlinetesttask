public class PaymentProcessor {

  /**
  Есть метод по оплате, он принимает сумму и номер карты и производит по ним оплату.
  Какие условия не учтены в этом методе?
  Как его можно доработать?
  */

  public boolean processPayment(double amount, String cardNumber) {
    if (amount < 0) return false;
    if (cardNumber.length() != 16) return false;
    return true;
  }
}
