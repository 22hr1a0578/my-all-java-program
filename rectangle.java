class Rectangle{
	int length;
	int width;
	void detail(int l,int w){
		length=l;
		width=w;
}

void display()
{
	System.out.println(length*width);
}
}
class testRectangle{
	public static void main(String args[])
{
Rectangle r=new Rectangle();
Rectangle r1=new Rectangle();
r.detail(11,12);
r1.detail(12,11);
r.display();
r1.display();
}
}