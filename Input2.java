import java.util.Scanner;
class Input2
{
	public static double div(int a,int b)
	{
		double c=a/b;
		return c;
	}
	public static double add(int a,int b)
	{
		double c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=s.nextInt();
		System.out.println("enter the number:");
		int b=s.nextInt();
		System.out.println(a+"+"+b+"="+add(a,b));
		System.out.println(a+"/"+b+"="+div(a,b));
	}
}