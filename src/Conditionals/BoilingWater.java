package Conditionals;

import java.util.Scanner;

public class BoilingWater {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a number greater than 212:");
      double temp = Double.parseDouble(scanner.nextLine());

      if (temp > 212) {
        System.out.println("Water is boiling!");
      }
    }
  }
}
