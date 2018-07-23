import java.util.Scanner;

class Input
{
    public static void main(String[] args)
    {
        System.out.println("Enter id, name, sal: ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.next();
        float sal = scan.nextFloat();
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + sal);
    }
}
