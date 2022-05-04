package Conditionals;

import java.util.Scanner;

public class TestScores {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Name a number between 0 and 100");
      double score = Double.parseDouble(scanner.nextLine());

      if (score > 100) {
        System.out.println("You are cheating!  >:U");
      } else if (score >= 90) {
        System.out.println("Your grade is an A  :D");
      } else if (score >= 80) {
        System.out.println("Your grade is a B  :)");
      } else if (score >= 70) {
        System.out.println("Your grade is a C  :/");
      } else if (score >= 60) {
        System.out.println("Your grade is a D  :(");
      } else if (score >= 0) {
        System.out.println("Your grade is an F  D:");
      } else {
        System.out.println("Seek medical attention!  ;-;");
      }
    }
  }
}
