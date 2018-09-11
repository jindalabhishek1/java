import java.util.Scanner;

interface Rate
{
    final double costDomectic = 5;
    final double costCommercial = 10.5;
}

abstract class Electricity_Bill implements Rate
{
    double rate;
    abstract void getRate();
    final void billCalculate(int units)
    {
        double bill = units * rate;
        System.out.println("Total bill = " + bill);
    }
}

class Domestic extends Electricity_Bill
{
    void getRate()
    {
        rate = costDomectic;
    }
}

class Commercial extends Electricity_Bill
{
    void getRate()
    {
        rate = costCommercial;
    }
}

class Electricity
{
    public static void main(String [] args)
    {
        Domestic d = new Domestic();
        d.getRate();
        System.out.println("Domestic Use: ");
        d.billCalculate(200);
        Commercial c = new Commercial();
        c.getRate();
        System.out.println("Commercial Use: ");
        c.billCalculate(5000);
    }
}
