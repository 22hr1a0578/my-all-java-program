import java.util.Scanner;
class loop2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n;i++){
System.out.print(i+",");
}System.out.print("\n");
for(int i=n;i>0;i=i-5){
System.out.print(i+",");
}
System.out.print("\n");
for(int i=0;i<n;i=i+5){
System.out.print(i+",");
}System.out.print("\n");
for(int i=100;i>=0;i--){
System.out.print(i+",");
}System.out.print("\n");

}
}
