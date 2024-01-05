import java.io.*;
import java.util.*;
class Test{
static public void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	System.out.println(Test.printmonth(i));
}
public static String printmonth(int monthno)
{
	String month;
	switch(monthno){
	case 0:{month="jan";break;}
	case 1:{month="feb";break;}
	case 2:{month="mar";break;}
	case 3:{month="april";break;}
	case 4:{month="may";break;}
	case 5:{month="jun";break;}
	case 6:{month="aug";break;}
	case 6:{month="sep";break;}
	case 6:{month="oct";break;}
	case 6:{month="nov";break;}
	case 6:{month="dec";break;}
	default: month="INVALID";
}
return month;
}
}