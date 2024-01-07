import java.util.*;
class demo2{
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
public int sub(int a,int b)//with argument  with return value function
{
int res=a-b;
return res;
}
public int input()//no argument  with return value function
{
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}



}
class Test{
public static void main(String args[]){
demo2 ob=new demo2();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=ob.input();
int n2=ob.input();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}