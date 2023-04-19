package org.mhj.strategy;

public class CreditCardPayment implements PayStrategy {

  @Override
  public void pay() {
    System.out.println("Paiement Credit-Card effectue avec succes");
  }
}
