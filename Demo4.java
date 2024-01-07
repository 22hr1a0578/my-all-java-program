import java.util.*;
class Demo4{
public long calculateFactorial(int n)
{
if(n==0)return 1;
else
return n*calculateFactorial(n-1);
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo4 ob=new Demo4();
System.out.println(ob.calculateFactorial(p));
}
}