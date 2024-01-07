import java.util.Scanner;
class Demo3{
public int[]input()//no argument with return array value function
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("please type"+n+"Integer");
for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}
return arr;
}
public int add(int[] a)//with array argument and return value function
{
int sum=0;
for(int i=0;i<a.length;i++){sum +=a[i];}
return sum;
}
}
class Test{
public static void main(String args[]){
Demo3 ob=new Demo3();
int[] array=new int[5];
array=ob.input();
int res=ob.add(array);
System.out.println(res);
}
}

