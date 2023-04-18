package org.mhj.decarator;

public class Cafe extends Boisson {

  public Cafe() {
    description = "Cafe";
  }

  @Override
  public double cout() {
    return 7.0;
  }
}
