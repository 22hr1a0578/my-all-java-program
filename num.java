import java.util.Scanner;
class Demo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if(i>=0&&i<=9)
System.out.print("yes");
else
System.out.println("no");
}
}