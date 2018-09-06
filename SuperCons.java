class one
{
    int i;
    one(int i)
    {
        this.i = i;
    }

    one()
    {
        System.out.println("Default cons of class one");
    }
}

class two extends one
{
    int i;
    two(int a, int b)
    {
        // if commented we have to make default constructor of class one.
        //super(a);
        i = b;
    }

    void show()
    {
        System.out.println("Sub class:i = " + i);
        System.out.println("Super class:i = " + super.i);
    }
}

class SuperCons
{
    public static void main(String [] args)
    {
        two t = new two (11, 22);
        t.show();
    }
}
