class StringBuilderOper
{
    public static void main(String [] args)
    {
        StringBuilder s = new StringBuilder();
        String s1 = new String();
        //s = "Hello";
        s.append("HELLO");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        s.reverse();
        s.replace(1,4,"ALLO");
        System.out.println(s);
        s.delete(1,2);
        System.out.println(s);
        s1 = s.substring(2,4);
        System.out.println(s1);
        s.insert(1, "E");
        System.out.println(s);
        s.delete(4,5);
        System.out.println(s);
    }
}
