 import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')
System.out.println("vowel");
else 
System.out.println("NOt vowel");
}
}