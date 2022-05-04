public class Casting {
  public static void main(String[] args) {
    double step1Double = 112.35;
    int step1Int = (int)step1Double;
    
    System.out.println("Double: " + step1Double);
    System.out.println("Int: " + step1Int);

    String step2String = "49";
    int step2Int = Integer.parseInt(step2String);

    System.out.println("The string value is: " + step2String);
    System.out.println("The integer value is: " + step2Int);
  }
}
