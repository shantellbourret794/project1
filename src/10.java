
package com.example;

import java.util.Random;

public class RandomNumber {
  public static int getRandomNumber() {
    Random rand = new Random();
    return rand.nextInt(10);
  }
}