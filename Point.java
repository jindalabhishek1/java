class Point
{
    int x, y;
    public void swap(Point arg1, Point arg2)
    {
        arg1.x = 100;
        arg1.y = 100;
        int temp, t1;
        temp = arg1.x;
        t1=arg1.y;
        arg1.x = arg2.x;
        arg1.y = arg2.y;
        arg2.x = temp;
        arg2.y = t1;
        /*Point temp = new Point();
        temp.x = arg1.x;
        temp.y = arg1.y;
        arg1.x = arg2.x;
        arg1.y = arg2.y;
        arg2.x = temp.x;
        arg2.y = temp.y;*/
    }
    public static void main(String [] args)
    {
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println("x = " + p1.x + ". y = " + p1.y);
        System.out.println("x = " + p2.x + ". y = " + p2.y);
        Point p3 = new Point();
        p3.swap(p1, p2);
        System.out.println("After Swap:");
        System.out.println("x = " + p1.x + ". y = " + p1.y);
        System.out.println("x = " + p2.x + ". y = " + p2.y);
    }
}
