public class binaryconversion 
{
  public static void main (String[] args)
  {
    int read = Integer.parseInt(args[0]);
    
    while (read != 0 )
    {
      System.out.print(read%2);
      read /= 2;
    }
    System.out.println();
  }
}
