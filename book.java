class student
{
	private String name;
	private int rollno;
	private String branch;
	private String sec;
	private String subject;
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	public void setRollno(int rollno){this.rollno=rollno;}
	public int getRollno(){return rollno;}
	public void setBranch(String branch){this.branch=branch;}
	public String getBranch(){return branch;}
	public void setSec(String sec){this.sec=sec;}
	public String getSec(){return sec;}
	public void setSubject(String subject){this.subject=subject;}
   public String getSubject(){return subject;}
	
}
class BSC{
	public static void main(String args[])
	{
		student ob=new student();
		ob.setName("LATHA");
		ob.setRollno(22578);
		ob.setBranch("cse");
		ob.setSec("Bsec");
		ob.setSubject("maths");
		System.out.println("name:"+ob.getName());
		System.out.println("rollno:"+ob.getRollno());
		System.out.println("branch:"+ob.getBranch());
		System.out.println("sec:"+ob.getSec());
		System.out.println("subject:"+ob.getSubject());
}
}