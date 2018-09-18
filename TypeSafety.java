import java.util.*;

class TypeSafety
{
    public static void main(String [] args)
    {
        ArrayList <String> a1 = new ArrayList <String> ();
        a1.add("Sachin");
        a1.add("Rahul");
        a1.add(10);
        String s1 = (String) a1.get(0);
        String s2 = (String) a1.get(1);
        String s3 = (String) a1.get(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
