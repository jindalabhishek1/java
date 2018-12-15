import java.util.Scanner;

class ArrayMarks
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        // int marks[][] = new int [3][4];
        int marks[][];
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();
        marks = new int [rows][cols];
        for (int i = 0; i < marks.length; i++)
        {
            for (int j = 0; j < marks[i].length; j++)
            {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("My array");
        for (int i = 0; i < marks.length; i++)
        {
            for (int j = 0; j < marks[i].length; j++)
            {
                System.out.println(marks[i][j]);
            }
        }
    }
}
