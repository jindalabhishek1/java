import java.util.*;

class Class
{
    /*
    public static void main(String[] args)
    {
        int x = 10;
        int y = new Class().change(x);
        System.out.println(x+y);
    }
    int change(int x)
    {
        x = 12;
        return x;
    }
    */

    /*
    public static void main(String[] args)
    {
        int x = 5;
        {
            int x = 10;
            System.out.prinln("x = " + x);
        }
    }
    */

    /*
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
    */

    /*
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        t.setName("New Thread");
        System.out.println(t.getPriority());
    }
    */

    public static void main(String[] arg)
	{
		Vector vec = new Vector(7);

		// use add() method to add elements in the vector
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);
		vec.add(6);
		vec.add(7);

		// insert 10 at the index 7
		vec.insertElementAt(10, 4);

		// checking vector
		System.out.println(" Vector: " + vec);
	}
}
