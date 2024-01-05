class student
{
	private int id;
	private String name;
	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	{this.name=name;}
	public int getId(){return id;}
	public String getName(){return name;}
}
class BSC{
	public static void main(String args[])
	{
		student ob=new student();
		ob.setId(5178);
		ob.setName("latha");
		System.out.println("id:"+ob.getId());
		System.out.println("name:"+ob.getName());
	}
}