class SuperClass
{
    void calculate(double x)
    {
        System.out.println(x * x);
    }
}

class SubClass extends SuperClass
{
    void calculate(double x)
    {
        System.out.println(x * x * x);
    }
}

class Overriding
{
    public static void main(String [] args)
    {
        SuperClass s1 = new SuperClass();
        s1.calculate(5);
        SubClass s2 = new SubClass();
        s2.calculate(5);
        SuperClass s3 = new SubClass();
        s3.calculate(5);
    }
}
