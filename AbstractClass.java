import java.util.Scanner;

abstract class Square
{
    float side, res;
    abstract void calculate(float x);
    void display()
    {
        System.out.println("Result:- " + res);
    }
}

class Sq extends Square
{
    void calculate(float x)
    {
        side = x;
        res = side * side;
    }
}
/*
class Sqrt extends Square
{
    void calculate(int x)
    {
        side = x;
        r =
    }
}
*/

class Cube extends Square
{
    void calculate(float x)
    {
        side = x;
        res = side * side * side;
    }
}

class AbstractClass
{
    public static void main(String[] args)
    {
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        x = sc.nextFloat();
        Sq obj1 = new Sq();
        obj1.calculate(x);
        obj1.display();
        Cube c = new Cube();
        // not possible coz Square is an AbstractClass.
        // Cube c = new Sqare();
        c.calculate(x);
        c.display();
    }
}

// Just a comment 
