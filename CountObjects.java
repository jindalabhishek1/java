class CountObjects
{
    static int count;
    CountObjects()
    {
        ++count;
    }
    public static void main(String [] args)
    {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
        System.out.println("No of elements = " + count);
    }
}
