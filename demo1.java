import java.util.*;
class demo1{
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
public int sub(int a,int b)//with argument  return value function
{
int res=a-b;
return res;
}


}
class Test{
public static void main(String args[]){
demo1 ob=new demo1();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
//System.out.println(r);

}
}