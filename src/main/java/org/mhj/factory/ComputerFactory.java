package org.mhj.factory;

public class ComputerFactory {

  public static Computer getComputer(String type) {
    switch (type) {
      case "pc":
        return new Pc("8Go", "1To SATA", "2.3 Ghz");
      case "gamer":
        return new PCGamer("32Go", "2To SSD", "4.0 Ghz");
      case "server":
        return new Server("128Go", "8To SDD", "6.0 Ghz");
      case "imaginaire":
        return new PcImaginaire("1To", "100 To SSD", "24.0 Ghz");
      default:
        throw new IllegalArgumentException("Ce type de PC n'existe pas encore");
    }
  }

}
