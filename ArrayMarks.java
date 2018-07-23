import java.util.Scanner;

class ArrayMarks
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int marks[][] = new int [3][4];
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
