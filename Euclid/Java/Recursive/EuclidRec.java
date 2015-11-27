public class EuclidRec 
{

  public static double GCD (double a, double b)
  {
    if (b == 0)
      return a;
    else return GCD(b, a%b);
  }

  public static void main (String[] args)
  {
    double firstNumber = Double.parseDouble(args[0]);
    double secondNumber = Double.parseDouble(args[1]);

    double gcd = GCD (firstNumber, secondNumber);
    System.out.println(gcd);
  }
}
