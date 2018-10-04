import java.util.*;

class Reservation implements Runnable
{
    int avail = 1;
    int wanted;
    Reservation(int i)
    {
        wanted = i;
    }
    public void run()
    {
        synchronized(this)
        {
            System.out.println("Available Seats = " + avail);
            if (avail >= wanted)
            {
                String name = Thread.currentThread().getName();
                System.out.println("Seat reseved for = " + name);
                try
                {
                    Thread.sleep(1500);
                    avail = avail - wanted;
                }
                catch(InterruptedException e){}
            }
            else
            {
                System.out.println("Sorry no seats available");
            }
        }
    }
}

class ThreadReservation
{
    public static void main(String [] args)
    {
        Reservation obj = new Reservation(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
