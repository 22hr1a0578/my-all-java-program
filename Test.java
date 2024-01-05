import java.util.*;
class Test{
public static void main(String args[])
	{
		boolean cond=true;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int a=10,b=1;
		System.out.println("cond is:"+cond);
		System.out.println("var1="+a);
		System.out.println("var2="+b);
		System.out.println("Now cond is:"+!cond);
		System.out.println("!(a<b)="+!(a<b));
		System.out.println("!(a>b)="+!(a>b));
	}
}