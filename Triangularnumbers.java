public class Triangularnumbers
{
  public static void main (String[]args)
  {
   // System.out.println ("Hello World");
    int terms = 10;
    int[] arr = new int[terms];
      arr[0] = 1;

    for (int i = 1; i < arr.length; i++)
      {
	arr[i] = arr[i - 1] + (i + 1);
	System.out.println ("arr[" + i + "]=" + arr[i]);
      }
  }
}
