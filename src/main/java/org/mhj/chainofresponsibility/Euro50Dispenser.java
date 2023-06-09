package org.mhj.chainofresponsibility;

public class Euro50Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if (currency.getAmount() >= 50) {
      int number = currency.getAmount() / 50;
      int remain = currency.getAmount() % 50;
      System.out.println("Dispensing " + number + " 50€ ");
      if (remain != 0) chain.dispense(new Currency(remain));
    } else {
      chain.dispense(currency);
    }
  }
}
