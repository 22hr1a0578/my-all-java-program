class College
{
	int id;
	String name;
	String department;
	void detail(int n,String n1,String n2)
{
	id=n;
	name=n1;
	department=n2;
}
void display(){
System.out.println(id+" "+name+" "+department);
}
}
class College1
{
	public static void main(String args[]){
	College s1=new College();
	College s2=new College();
	s1.detail(517408, "latha","cse");
	s2.detail(1234,"shree","ece");
	s1.display();
	s2.display();
}
}