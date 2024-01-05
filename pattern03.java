import java.util.*;
class Pattern
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int row=sc.nextInt();
		printpattern(ch,row);
		}
		public static void printpattern(char c,int n)
	{
		for(int i=n;i>=1;i--)
		{
			printLine(c,i);
		}
	}
	public static void printLine(char c,int col)
	{
		System.out.print("\n");
		for(int j=1;j<=col;j++)
		{
			System.out.print(c);
		}
	}
		/*for(int j=0;j<=i;j++)
		{
		System.out.print(c);

			
		}*/
}