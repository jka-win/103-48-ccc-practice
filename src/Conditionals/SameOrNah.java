package Conditionals;

import java.util.Scanner;

public class SameOrNah {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a word:");
      String a = scanner.nextLine();
      System.out.println("Enter another word:");
      String b = scanner.nextLine();

      if (a.equals(b)) {
        System.out.println("The words are the same");
      } else {
        System.out.println("The words are different");
      }
    }  
  }
}
