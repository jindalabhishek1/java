import java.util.Scanner;

class ExceptionHandlingCommandLineArgs
{
    public static void main(String args[])
    {
        int n = args.length;
        try
        {
            int x = 45 / n;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Compiled Successfully");
    }
}
