class Emp
{
	int id;
	double salary;
}

class EmpMain
{
	public static void main (String x[])
	{
		Emp obj = new Emp();
		obj.id = 101;
		obj.salary = 25000;
		System.out.println (obj.id);
		System.out.println (obj.salary);
	}
}
