
import java.util.*;

class EmpDB
{
    Scanner sc = new Scanner(System.in);
    int i = 0;
    EmpBean objBean[];
    EmpDB()
    {
        objBean = new EmpBean[10];
    }
    void addRecord()
    {
        objBean[i]=new EmpBean();
        System.out.print("Enter ID: ");
        objBean[i].setId(sc.nextInt());
        System.out.print("Enter Name: ");
        objBean[i].setName(sc.next());
        System.out.print("Enter branch: ");
        objBean[i].setBranch(sc.next());
        System.out.print("Enter Address: ");
        objBean[i].setAddr(sc.next());
        System.out.print("Enter Salary: ");
        objBean[i].setSal(sc.nextInt());
        i++;
    }
    void showRecord(int id)
    {
        int j;
        for (j = 0; j < i; j++)
        {
            if (objBean[j].getId() == id)
            {
                break;
            }
        }
        System.out.println("ID: " + objBean[j].getId());
        System.out.println("Name: " + objBean[j].getName());
        System.out.println("Branch: " + objBean[j].getBranch());
        System.out.println("Address: " + objBean[j].getAddr());
        System.out.println("Salary: " + objBean[j].getSal());
    }
    void updateRecord(int id)
    {
        int j;
        for (j = 0; j < i; j++)
        {
            if (objBean[j].getId() == id)
            {
                break;
            }
        }
        System.out.println("What you want to update:\ni : Change Id\nn : Change name\nb : Change Branch\na : Change Address\ns : Change Salary");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'i':
                System.out.print("Enter Id: ");
                objBean[j].setId(sc.nextInt());
                break;
            case 'n':
                System.out.print("Enter Name: ");
                objBean[j].setName(sc.next());
                break;
            case 'b':
                System.out.print("Enter Branch: ");
                objBean[j].setBranch(sc.next());
                break;
            case 'a':
                System.out.print("Enter Address: ");
                objBean[j].setAddr(sc.next());
                break;
            case 's':
                System.out.print("Enter Salary: ");
                objBean[j].setSal(sc.nextInt());
                break;
            default:
                System.out.print("Enter The correct option!!!");
                break;
        }
    }
    void removeRecord()
    {
        i--;
    }
}
