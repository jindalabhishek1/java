import java.util.Scanner;

class Main
{
    public static void main(String args [])
    {
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();
        System.out.println("Enter Subject:");
        String subject = sc.next();
        System.out.println("Enter Marks:");
        int marks = sc.nextInt();
        System.out.println("Enter Grade:");
        String grade = sc.next();
        System.out.println(name + " Details:");
        System.out.println("Roll No: " + roll);
        System.out.println("Subject: " + subject);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
