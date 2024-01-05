import java.util.Scanner;
class Demo{
public static int add(int a,int b){
return a+b;
}
public static void printTable(int a){
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"=" +a*i);
}
public static void main(String args[]){
Scanner scobe=new Scanner(System.in);
int n1=scobe.nextInt();
int n2=scobe.nextInt();
int res=Demo.add(n1,n2);
System.out.println(res);
Demo.printTable(n1);
Demo.printTable(n2);
}
}