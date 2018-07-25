class ThisSample
{
    private int x;
    ThisSample()
    {
        this(55);
        this.access();
    }
    ThisSample(int x)
    {
        this.x = x;
    }
    void access()
    {
        System.out.println("x = " + x);
    }
}

class ThisDemo
{
    public static void main(String[] args)
    {
        ThisSample s = new ThisSample();
    }
}
