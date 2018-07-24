import java.util.Scanner;

class FindVolume
{
    float l, b, h;
    void get(float x)
    {
        l = x;
        b = x;
        h = x;
    }
    void get(float x, float y, float z)
    {
        l = x;
        b = y;
        h = z;
    }
    void get(float x, float y)
    {
        l = x;
        b = y;
    }
    float volume()
    {
        return (l * b * h);
    }
    float volume(float pi)
    {
        pi = h;
        return (h * l * l * b);
    }
}

class VolumeMain
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        FindVolume f = new FindVolume();
        f.get(5.5f);
        System.out.println("Volume of Cube = " + f.volume());
        f.get(5f, 8.0f, 8.5f);
        System.out.println("Volume of Cuboid = " + f.volume());
        f.get(5.5f, 20);
        System.out.println("Volume of Cylinder = " + f.volume(3.14f));
    }
}
