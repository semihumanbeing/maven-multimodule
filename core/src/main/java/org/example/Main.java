package org.example;

public class Main {

  public static void main(String[] args) {
    AService a = new AService();
    BService b = new BService();
    System.out.println(a.aTest());
    System.out.println(b.bTest());
  }

}
