package org.mhj.decarator;

public class Chocolat extends BoissonDecarateur {

  public Chocolat(Boisson boisson) {
    super(boisson);
  }

  @Override
  public double cout() {
    return 3.3 + boisson.cout();
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au chocoloat";
  }
}
