package com.mycompany.app;

// var i;
// var k;

/** Hello world! */
public class App {

  // var m;
  // var l;
  // var lml;
  // var hetes;
  // var tes;
  private final String message = "Hello World!";

  public App() {}

  public static void main(String[] args) {
    System.out.println(new App().getMessage());
  }

  private final String getMessage() {
    return message;
  }
}
