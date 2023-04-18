package org.mhj.decarator;

public class DecaratorMain {

  public static void main(String[] args) {
    Boisson espresso = new Espresso();
    System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());

    espresso = new Lait(espresso);
    System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());

    espresso = new Chocolat(espresso);
    System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());

    espresso = new Caramel(espresso);
    System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout());
  }

}
