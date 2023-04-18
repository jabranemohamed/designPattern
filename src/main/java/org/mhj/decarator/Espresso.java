package org.mhj.decarator;

public class Espresso extends Boisson {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cout() {
    return 6.5;
  }
}
