class InheritMain
{
    public static void main(String [] args)
    {
        Square s = new Square(5.5);
        s.area();
        Rectangle r = new Rectangle(5.5, 6);
        r.area();
    }
}

class Shape
{
    protected double l;
    Shape(double l)
    {
        this.l = l;
    }
}

class Square extends Shape
{
    Square(double l)
    {
        super(l);

    }

    void area()
    {
        System.out.println("Area of Square = " + (l * l));
    }
}

class Rectangle extends Shape
{
    double b;
    Rectangle(double l, double b)
    {
        super(l);
        this.b = b;
    }

    void area()
    {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}
