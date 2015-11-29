import java.util.Scanner;


/*
 * Checking if a number is even using bitwise operators
 */
public class Even
{
  public static void isEven(int n)
  {
    /*
     * Logic : the last bit says if a number is even or not.
     * if i and it with 1 if it is 0 its even if 1 its not even
     */
    if ( (n & 1) == 0 )
      System.out.println (n +  "is even ");
    else System.out.println (n + "is not even ");
  }

  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);

    while (true)
    {
      int x =input.nextInt();
      isEven (x);
    }
  }
}
