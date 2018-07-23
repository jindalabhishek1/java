import java.util.Scanner;

class ArrayID
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println ("My created array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println (arr[i]);
        }
    }
}
