class Student1{
	int rn;
	String name;
	void detail(int r,String n)
		{
		 rn=r;
		 name=n;
       }
void Display()
{
System.out.println(rn+" "+name);
}
}
class Student2
{
public static void main(String args[])
{
Student1 s1=new Student1();
Student1 s2=new Student1();
s1.detail(41,"latha");
s1.Display();
s2.detail(23,"shree");
s2.Display();
}
}