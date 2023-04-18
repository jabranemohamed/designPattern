package org.mhj.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenserChain {

  private Euro100Dispenser euro100Dispenser;

  public ATMDispenserChain() {
    euro100Dispenser = new Euro100Dispenser();
    Euro50Dispenser euro50Dispenser = new Euro50Dispenser();
    Euro20Dispenser euro20Dispenser = new Euro20Dispenser();
    Euro10Dispenser euro10Dispenser = new Euro10Dispenser();
    Euro5Dispenser euro5Dispenser = new Euro5Dispenser();

    euro100Dispenser.setNextChain(euro50Dispenser);
    euro50Dispenser.setNextChain(euro20Dispenser);
    euro20Dispenser.setNextChain(euro10Dispenser);
    euro10Dispenser.setNextChain(euro5Dispenser);
  }

  public static void main(String[] args) {
    ATMDispenserChain dispenser = new ATMDispenserChain();

    while (true) {
      int amount = 0;
      System.out.println("Enter amount to dispense");
      Scanner scanner = new Scanner(System.in);
      amount = scanner.nextInt();
      if (amount % 5 != 0) {
        System.out.println("The amount should be a multiple of 5");
        return;
      }
      dispenser.euro100Dispenser.dispense(new Currency(amount));
    }
  }
}
