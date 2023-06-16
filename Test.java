

public class Test {
  public static void check(int age) throws IllegalAccessException {
    System.out.println("Inside check function");
    if (age < 18) {
      throw new IllegalAccessException("demo");
    }
  }

  public static void main(String args[]) {
    try {
      check(19);
    } catch (IllegalAccessException e) {
      System.out.println("caught" + e);
    } finally {
      System.out.println("always executed");
    }
  }
}
