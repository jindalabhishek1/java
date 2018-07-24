import java.util.Scanner;

class Matrix
{
    int arr[][], m, n;
    Matrix(int x, int y)
    {
        m = x;
        n = y;
        arr = new int [m][n];
    }
    int [][] getValues()
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("Enter value of element [%i][%i] : ", (i + 1), (j + 1));
            }
        }
    }
}

class MatrixMultiplication
{
    public static void main(String args[])
    {
        Matrix M1 = new Matrix(3, 3);
        Matrix M2 = new Matrix(3, 3);
        int x[][], y[][], z[][];
        x = M1.getValues();
        y = M2.getValues();
        z = M1.multiply(x, y);
        M2.printMatrix(z);
    }
}
