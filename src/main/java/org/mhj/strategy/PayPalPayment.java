package org.mhj.strategy;

public class PayPalPayment implements PayStrategy {

  @Override
  public void pay() {
    System.out.println("Paiement PayPal effectue avec succes");
  }
}
