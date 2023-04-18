package org.mhj.decarator;

public class Lait extends BoissonDecarateur {


  public Lait(Boisson boisson) {
    super(boisson);
  }

  @Override
  public double cout() {
    return 1.5 + boisson.cout();
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au lait";
  }
}
