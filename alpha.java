import java.util.*;
class alpha
{
	public static void main(String args[])
	{
		Scanner ch=new Scanner(System.in);
		char c=ch.next().charAt(0);	
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
		System.out.println("it is an alphabet"+" "+c);
}
		else{
		System.out.println("it is not an alphabet"+" "+c);
}
 	}
}
		