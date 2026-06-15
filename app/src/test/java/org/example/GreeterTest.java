package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
  @Test
  void itHasAGreeting() {
    HelloWorld helloWorld = new HelloWorld();
    assertEquals("Hello World!", helloWorld.getGreeting());
  }
}
