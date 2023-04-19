package org.mhj.strategy;

public class PaymentContext {

  private PayStrategy strategy;

  public PaymentContext(PayStrategy strategy) {
    this.strategy = strategy;
  }

  void executePayment() {
    if (strategy == null) {
      System.err.println("Aucun moyen de payement n'a ete defini");
      return;
    }
    strategy.pay();
  }

  public void setStrategy(PayStrategy strategy) {
    this.strategy = strategy;
  }
}
