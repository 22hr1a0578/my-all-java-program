class Employee
{
float salary=40000;
}
class prog extends Employee
{
	int bonus=10000;
	public static void main(String args[])
	{
		prog p=new prog();
		System.out.println("Programmer salary: "+p.salary);
		System.out.println("Programmer bonus: "+p.bonus);
	}
}
		