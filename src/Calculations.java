import java.util.Scanner;

public class Calculations {
  public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
      System.out.println("Enter a number:");
      int a = Integer.parseInt(scanner.nextLine());
      System.out.println("Enter another number:");
      int b = Integer.parseInt(scanner.nextLine());

      System.out.println("""
        %d + %d = %d
        %1$d - %2$d = %d
        %1$d * %2$d = %d
        %1$d / %2$d = %s
        %1$d %% %2$d = %d
        """.formatted(a, b, 
          a + b, a - b, a * b, (double)a / b, a % b));
    }
  }
}
