class Calc
{
    Calc (int a)
    {
        System.out.println("Area of Square = " + (a * a));
    }
    Calc (float a)
    {
        System.out.println("Area of circle = " + (1.34 * a * a));
    }
    Calc (int l, int b)
    {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

class Area
{
    public static void main(String [] args)
    {
        Calc areaSquare = new Calc (5);
        Calc areaCircle = new Calc (5.5f);
        Calc areaRectangle = new Calc (4, 5);
    }
}
