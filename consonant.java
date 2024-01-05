 import java.util.Scanner;
class Consonant
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
if((c>='a')&&(c<='z'))
	{

		  if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
       {    
    	   System.out.print("vowel");
       }
         else
       {
 		System.out.print("consonant");
       } 
    }
else
{
		System.out.print("not an alphabet");
}
}
}