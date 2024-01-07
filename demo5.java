import java.util.*;
class Demo5{
public long calculateFactorial(int n)
{
long res=1;
if(n==0)return 1;
else{for(int i=1;i<=n;i++)res=res*i;
return res;}//else
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo5 ob=new Demo5();
System.out.println(ob.calculateFactorial(p));
}
}