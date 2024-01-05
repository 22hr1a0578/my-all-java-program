import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
if(n%2==0)
{
System.out.println("EVEN");
System.out.println(n+"is Even");
}
else
{
System.out.println("ODD");
System.out.println(n+"is odd");
}
}
}