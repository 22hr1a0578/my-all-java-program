class College3
{
	int id;
	String name;
	String department;
	College3(int n,String n1,String n2)
{
	id=n;
	name=n1;
	department=n2;
	System.out.println(id+" "+name+" "+department);
}
}
class College1
{
	public static void main(String args[]){
	College3 s1=new College3(1234,"latha","cse");
	//College3 s2=new College3(3421,"shree","ece");
	
}
}