package org.mhj.strategy;

public class CustomPayment implements PayStrategy {

  @Override
  public void pay() {
    System.out.println("Paiement personnalise a ete efecture avec succes");
  }
}
