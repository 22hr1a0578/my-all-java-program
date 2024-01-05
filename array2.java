import java.util.*;
class array2{
	public static void main(String args[]){
		int n,x,flag=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements you want in array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); 
	   }
			System.out.println("enter the element you want to find:");
			x=sc.nextInt();

			for(i=0;i<n;i++)
			{
				if(a[i]==x)  
				{
					flag=1; break;
				}
			}//for
if(flag==1)
{
System.out.println("elements found at position:"+(i+1));
}
else{
System.out.print("element not found");
}
}
}
