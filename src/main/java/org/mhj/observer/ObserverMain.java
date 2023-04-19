package org.mhj.observer;

import java.util.Scanner;

public class ObserverMain {

  public static void main(String[] args) {
    Subject subject = new Subject();

    new BinaryObserver(subject);
    new OctalObserver(subject);
    new HexaObserver(subject);

    while (true) {
      System.out.println("Saisir un nombre a convertir");
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      subject.setState(number);
    }
  }

}
