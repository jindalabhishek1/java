import java.util.Scanner;

class SumAvg
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of element: ");
        int sum = 0;
        int size = s.nextInt();
        int arr[] = new int [size];
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum is = " + sum);
    }
}
