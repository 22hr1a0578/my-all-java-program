import java.util.*;
public class Char1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<=str.length()-1;i++){
		if((str.charAt(i)=='0')||(str.charAt(i)=='1')||
			(str.charAt(i)=='2')||(str.charAt(i)=='3')||
			(str.charAt(i)=='4')||(str.charAt(i)=='5')||
			(str.charAt(i)=='6')||(str.charAt(i)=='7')||
			(str.charAt(i)=='8')||(str.charAt(i)=='9'))
				count++;}
				System.out.print(count);
			
}
}
}