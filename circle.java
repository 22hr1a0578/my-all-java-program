class circle{
	int radius;
	void detail(int r){
		radius=r;
	}
void display()
{
System.out.println(3.14*radius*radius);
}
}
class Testcircle{
	public static void main(String args[])
	{
		circle c=new circle();
		c.detail(1);
		c.display();
}
}