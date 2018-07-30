class SB
{
    public static void main(String [] args)
    {
        StringBuffer sb=new StringBuffer("Life is Awesome!");
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer(" And I am too!!");
        System.out.println(sb2);
        sb.append(sb2);
        System.out.println(sb);
    }
}
