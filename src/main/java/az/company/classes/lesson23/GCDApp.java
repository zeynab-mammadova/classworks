package az.company.classes.lesson23;

public class GCDApp {
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }


  public static void main(String[] args) {
    System.out.println(gcd(7,5));
    System.out.println(gcd(5,20));
    System.out.println(gcd(36,24));
    System.out.println(gcd(3,9));

  }
}