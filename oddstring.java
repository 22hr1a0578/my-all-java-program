import java.util.*;
class charat1{
public static void main(String args[]){
//String str="Welcome to our college";
Scanner sc=new Scanner(System.in);
System.out.println("enter your str: ");
String str=sc.nextLine();
for(int i=0;i<=str.length()-1;i++){
if(i%2!=0){System.out.println("char at  "+i+"place  "+str.charAt(i));}
}
}
}