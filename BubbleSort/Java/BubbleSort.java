public class BubbleSort
{
  //method that prints the array
  private static void print (double[] array)
  {
    for (int i=0 ; i<array.length ; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }

  //bubblesort method
  public static void BubbleSort (double[] array)
  {
    int length = array.length;
    for (int i=0 ; i<length-1 ; i++)
      for (int j=i+1 ; j<length ; j++)
       if (array[i] > array[j])
       {
         double swap = array[i];
         array[i]=array[j];
         array[j]=swap;
       }
  }

  public static void main (String[] args)
  {
    double[] arrayToSort={2,3,1,2,3,0.2,-1,-15}; 

    //sorting ascending order
    BubbleSort(arrayToSort);
    print (arrayToSort);

    //reverse array
    for (int i=0 ; i<arrayToSort.length ; i++)
      arrayToSort[i] *= -1;
    //sorting in descending order

    BubbleSort(arrayToSort);

    //reverse back
    for (int i=0 ; i<arrayToSort.length ; i++)
      arrayToSort[i] *= -1;

    print (arrayToSort);
  }
}
