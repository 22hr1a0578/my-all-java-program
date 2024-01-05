import java.util.*;
class Ifelse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=s.nextInt();
int j=s.nextInt();
if(j==0)
{
System.out.println("division by error");
}
else
{
System.out.println(i+" divide by "+j+"is"+(i/j));
i=i+j;
}
}
}