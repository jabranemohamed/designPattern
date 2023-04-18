package org.mhj.decarator;

public abstract class BoissonDecarateur extends Boisson {

  protected Boisson boisson;

  public BoissonDecarateur(Boisson boisson) {
    super();
    this.boisson = boisson;
  }

  public abstract String getDescription();

}
