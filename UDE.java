import java.util.Scanner;

class NetAmtExcp extends Exception
{
    String msg;
    public NetAmtExcp(String msg)
    {
        this.msg = msg;
    }
    public String toString()
    {
        return msg;
    }
}

class UDE
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        try
        {
            if(amt < 0)
            {
                throw new NetAmtExcp("Invalid Amount");
            }
            System.out.println("Amount = " + amt);
        }
        catch(NetAmtExcp n)
        {
            System.out.println(n);
        }
    }
}
