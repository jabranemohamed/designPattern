package org.mhj.chainofresponsibility;

public interface DispenseChain {

  void setNextChain(DispenseChain nextChain);

  void dispense(Currency currency);

}
