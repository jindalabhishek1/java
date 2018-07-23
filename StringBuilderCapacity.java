class StringBuilderCapacity
{
    public static void main(String [] args)
    {
        StringBuilder s = new StringBuilder("Hi! I am Abhi");
        System.out.println(s.capacity());
        s = s.append(" Jindal");
        System.out.println(s.capacity());
        s = s.append(". I am an \"Computer Science\" student");
        System.out.println(s.capacity());
        s.ensureCapacity(70);
        System.out.println(s.capacity());
    }
}
