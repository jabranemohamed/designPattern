package org.mhj.chainofresponsibility;

public class Euro100Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if (currency.getAmount() >= 100) {
      int number = currency.getAmount() / 100;
      int remain = currency.getAmount() % 100;
      System.out.println("Dispensing " + number + " 100€ ");
      if (remain != 0) chain.dispense(new Currency(remain));
    } else {
      chain.dispense(currency);
    }
  }
}
