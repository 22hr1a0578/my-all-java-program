class test1{
public static void main(String args[])
{
int i=0;
int sum=0;
for(i=0;i<=20;i=i+5){
System.out.print(i+"+");
sum=sum+i;
}
System.out.print("\b"+"="+sum);
}
}