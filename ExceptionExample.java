class ExceptionExample
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Hello" + " " + 1/0);
        }
        catch(Exception e)
        {
            System.out.println("World");
        }
    }
}
