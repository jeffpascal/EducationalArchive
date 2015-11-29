public class Bitwise
{
  /*
   * They are used when dealing with very large numbers
   */
  public static void main (String[] args)
  {
    System.out.println (38 & 23);

    /*
     *   32 16 8 4 2 1
     *38: 1  0 0 1 1 0
     *23: 0  0 0 1 1 1
     * 6: 0  0 0 1 1 0
     * Bitwise & same truth table as and
     */

    System.out.println (38 | 23);

    /*
     *   32 16 8 4 2 1
     *38: 1  0 0 1 1 0
     *23: 0  0 0 1 1 1
     *49: 1  0 0 1 1 1
     * Bitwise | same truth table as or
     */

    System.out.println (~23);

    /*
     *  Takes all the bits and negates them (all 32 for int)
     *  same truth table as not
     */

    System.out.println (40 << 1); // bitwise leftshift by 1

    /*
     *40: 0 1 0 1 0 0 0
     *80: 1 0 1 0 0 0 0   shifted by 1 to the left
     * every time you leftshift by one you are multiplying by 2
     * 
     * 40 << 3 means multiplied by 8 ( 2 to the power of 3) and so on
     * same thing to negative numbers (keeps the sign)
     */

    System.out.println (40 >> 1); // right shift

    /*
     *40: 0 1 0 1 0 0 0
     *20: 0 0 1 0 1 0 0
     * every time i rightshift i divide by 2
     * its integer division (no decimals)
     * works on negative numbers (keeps sign)
     */

    System.out.println (40 >>> 1); // logical right shift

    /*
     * same thing as the >>
     * it is different only when dealing with negative number
     * does not care about the sign bit
     */
  }
}
