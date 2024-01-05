import java.io.*;
class Test1{
	public static void main(String args[]){
		double i=100.245;
		//narrow typecasting
		short j=(short)i;
		int k=(int)i;
		System.out.println("original value before type casting:"+i);
		System.out.println("after typecasting to short:"+j);
		System.out.println("after typecasting to int:"+k);
}
}
