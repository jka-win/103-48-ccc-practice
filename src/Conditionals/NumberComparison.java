package Conditionals;

import java.util.Scanner;

public class NumberComparison {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a number:");
      double a = Double.parseDouble(scanner.nextLine());
      System.out.println("Enter another number:");
      double b = Double.parseDouble(scanner.nextLine());

      if (a == b) {
        System.out.println("Numbers are the same");
      } else if (a > b) {
        System.out.println("The first number was larger than the second");
      } else {
        System.out.println("The second number was larger than the first");
      }
    }
  }
}
