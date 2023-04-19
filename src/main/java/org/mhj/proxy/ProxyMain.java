package org.mhj.proxy;

public class ProxyMain {

  public static void main(String[] args) {
    CommandExecutor cmdLine = new CommandExecutorProxy("ali", "passwr");

    try {
      cmdLine.executeCommand("ls -a");
      cmdLine.executeCommand("rm some folder");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
