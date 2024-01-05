import java.util.Scanner;
class RelationalOperators1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		System.out.println("enter third value");
		int n3=sc.nextInt();
		if((n1<n2)&&(n1<n3))
		{
			System.out.println("first number is smallest");
		}
		 if((n2<n1)&&(n2<n3))
		{
			System.out.println("second number is smallest");
		}
			else if((n3<n1)&&(n3<n2))
			{
				System.out.println("third number is smallest");
			}
		
	}
}