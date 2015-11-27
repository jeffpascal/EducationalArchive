public class Euclid
{
  public static double GCD (double a, double b)
  {
    while (a != b)
    {
      if (a>b)
        a -= b;
      else
        b -= a;
    }
    return a;
  }

  public static void main (String [] args)
  {
    double firstNumber = Double.parseDouble(args[0]);
    double secondNumber = Double.parseDouble(args[1]);

    double gcd = GCD (firstNumber,secondNumber);
    System.out.println(gcd);
  }
}
