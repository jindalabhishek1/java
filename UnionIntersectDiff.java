import java.util.*;
class UIDset
{
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();


		int n;
		System.out.println("enter 1st list");
		for(int i=0;i<5;i++)
		{
			n=sc.nextInt();
			l1.add(n);
		}
		System.out.println("enter 2nd list");
		for(int i=0;i<5;i++)
		{
			n=sc.nextInt();
			l2.add(n);
		}
		Set <Integer>s1=new HashSet<>(l1);
		Set <Integer>s2=new HashSet<>(l2);
		Set <Integer> union=new HashSet<>();
		Set <Integer> intersection=new HashSet<>();
		Set <Integer> d1=new HashSet<>();
		Set <Integer> d2=new HashSet<>();
		//Set <Integer> difference=new HashSet<>();
		union.addAll(s1);
		union.addAll(s2);
		System.out.println("union is "+union);
		intersection.addAll(s1);
		intersection.retainAll(s2);
		System.out.println("intersection is "+intersection);
		d1.addAll(s1);
		d1.removeAll(s2);
		d2.addAll(s2);
		d2.removeAll(s1);
		d1.addAll(d2);
		System.out.println("difference is "+d1);
		s1.addAll(s1);
		//System.out.println("difference is "+s1);
	}
}
