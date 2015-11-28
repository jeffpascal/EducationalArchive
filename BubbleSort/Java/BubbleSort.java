public class BubbleSort
{

  private static void print (double[] array)
  {
    for (int i=0 ; i<array.length ; i++)
      System.out.println(array[i] + " ");
  }
  private static void sortAscending (double[] array)
  {
    int i,j;
    int length = array.length;
    for (i=0 ; i<length ; i++)
      for (j=i+1 ; j<=length ; j++);
      {
       if (array[i] < array[j])
       {
         double swap = array[i];
         array[i]=array[j];
         array[j]=swap;
       }
      }
    print (array);
  }

  public static void main (String[] args)
  {
    double[] arrayToSort={2,3,1,2,3,0.2,-1,-15}; 

    sortAscending(arrayToSort);


  }
}
