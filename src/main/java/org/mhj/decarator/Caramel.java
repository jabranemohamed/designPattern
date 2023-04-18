package org.mhj.decarator;

public class Caramel extends BoissonDecarateur {


  public Caramel(Boisson boisson) {
    super(boisson);
  }

  @Override
  public double cout() {
    return 2.0 + boisson.cout();
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au caramel";
  }
}
