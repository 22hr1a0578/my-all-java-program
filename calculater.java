import java.util.*;
class calculater{
static int cube(int x){
return x*x*x;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int result=calculater.cube(n);
System.out.println(result);
}
}