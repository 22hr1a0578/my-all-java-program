public class WrapperExample3
{
 public static void main(String args[])
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean b2=true;
//autoboxing:converting primitives into obj
		Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;
System.out.println("____printing object values____");
System.out.println("Byte object"+byteobj);
System.out.println("short object"+shortobj);
System.out.println("int object"+intobj);
System.out.println("long object"+longobj);
System.out.println("double object"+doubleobj);
System.out.println("char object"+charobj);
System.out.println("bool object"+boolobj);

//unboxing
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean boolvalue=boolobj;
System.out.println("___printing data___");
System.out.println("byte value:"+bytevalue);
System.out.println("short value:"+shortvalue);
System.out.println("int value:"+intvalue);
System.out.println("long value:"+longvalue);
System.out.println("float value:"+floatvalue);
System.out.println("double value:"+doublevalue);
System.out.println("char value:"+charvalue);
System.out.println("bool value:"+boolvalue);
}
}