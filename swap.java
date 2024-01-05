import java.util.Scanner;
class InputSwap{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num1;int num2;
		num1=s.nextInt();
		num2=s.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+"n"+num2);
}
}