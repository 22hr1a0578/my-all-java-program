class student
{
	private int id;
	public void set(int id){this.id=id;}
	public int getid(){return id;}
}
class BSC{
	public static void main(String args[])
	{
		student ob=new student();
		ob.set(5178);
		System.out.println("id:"+ob.getid());
	}
}