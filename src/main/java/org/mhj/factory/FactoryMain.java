package org.mhj.factory;

public class FactoryMain {


  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("pc");
    System.out.println("Ma configuration PC : " + pc);

    Computer server = ComputerFactory.getComputer("server");
    System.out.println("Ma configuration SERVEUR : " + server);

    Computer imaginaire = ComputerFactory.getComputer("imaginaire");
    System.out.println("Ma configuration IMAGINAIRE : " + imaginaire);

  }
}
