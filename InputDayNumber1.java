import java.util.*;
class InputDayNumber1{
 public static void displayDay(int n)
{
	
	switch(n){
	case 0:System.out.println("JAN");break;
	case 1:System.out.println("FEB");break;
	case 2:System.out.println("MAR");break;
	case 3:System.out.println("APR");break;
	case 4:System.out.println("MAY");break;
	case 5:System.out.println("JUN");break;
	case 6:System.out.println("JUL");break;
	case 6:System.out.println("AUG");break;
	case 6:System.out.println("SEP");break;
	case 6:System.out.println("OCT");break;
	case 6:System.out.println("JUL");break;
	case 6:System.out.println("JUL");break;
	case 6:System.out.println("JUL");break;
 	default:System.out.println("INVALID");
}
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int  dn;
dn=scob.nextInt();
displayDay(dn);
}
}

      