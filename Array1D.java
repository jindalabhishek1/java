import java.util.Scanner;
class Array1D
{
    int size;
    int arr[];
    Array1D(int x)
    {
        size = x;
        arr= new int[size];
    }
    int[] getvalues()
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    int findSum(int x[])
    {
        int sum = 0;
        for(int i = 0; i < size; i++)
        {
            sum += x[i];
        }
        return sum;
    }

    public static void main(String [] args)
    {
        Array1D a1 = new Array1D(6);
        int x[];
        x = a1.getvalues();

        int sum = a1.findSum(x);
        System.out.println("Sum of element = " + sum);
    }
}
