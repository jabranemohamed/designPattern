package org.mhj.strategy;

public class CashPayment implements PayStrategy {

  @Override
  public void pay() {
    System.out.println("Paiement Cash effectue avec succes");
  }
}
