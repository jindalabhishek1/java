public class If2
{
    static boolean b1, b2; // b1 = b2 = false default value
    public static void main(String [] args)
    {
        int x = 0; // x = 0
        if ( !b1 ) // !b1 = !(false) = true
        {
            System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
            if ( !b2 ) // !b2 = !(false) = true
            {
                System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
                b1 = true; // b1 = true
                //System.out.println();
                System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
                x++; // x = 1
                if ( 5 > 6 ) // false
                {
                    x++;
                }
                if ( !b1 ) // !b1 = !(true) = flase
                {
                    System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
                    x = x + 10;
                }
                else if ( b2 = true )
                {
                    System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
                    x = x + 100;
                }
                else if ( b1 | b2 )
                {
                    System.out.println("b1 = " + b1 + " b2 = " + b2 + "\n");
                    x = x + 1000;
                }
            }
        }
        System.out.println(x);
    }
}
