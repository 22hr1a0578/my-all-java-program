//no argument to return value functions
import java.util.*;
class Demo{
public void displayMenu(){
System.out.println(" +Addition");
System.out.println("-Substraction * :Multiplication");
System.out.println("/ :division");
}
public void add(int a,int b)//with argument no return value function
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}

}
class Test{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
}
}