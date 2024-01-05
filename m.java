class student
{
	private String collegename;
	private String collegeaddress;
	private int aystart;
	private int ayend;
	private int id;
	private String name;
	private String course;
	private int aadharno;
	public void setCollegename( String collegename){this.collegename=collegename;}
	public void setCollegeaddress(String collegeaddress){this.collegeaddress=collegeaddress;}
	public void setAyStart(int aystart){this.aystart=aystart;}
	public void setAyEnd(int ayend){this.ayend=ayend;}
	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	public void setCourse(String course){this.course=course;}
	public void setAadharno(int aadharno){this.aadharno=aadharno;}
	public String getCollegename(){return collegename;}
	public String getCollegeaddress(){return collegeaddress;}
	public int getAyStart(){return aystart;}
	public int getAyEnd(){return ayend;}
	public int getId(){return id;}
	public String getName(){return name;}
	public String getCourse(){return course;}
	public int getAadharno(){return aadharno;}
}
class BSC{
	public static void main(String args[])
	{
		student ob=new student();
		ob.setCollegename("mtie");
		ob.setCollegeaddress("melumoi");
		ob.setAyStart(2022);
		ob.setAyEnd(2023);
		ob.setId(5178);
		ob.setName("latha");
		ob.setCourse("cse");
		ob.setAadharno(12345678);
		System.out.println("collegename:"+ob.getCollegename());
		System.out.println("address:"+ob.getCollegeaddress());
		System.out.println("Aystart:"+ob.getAyStart());
		System.out.println("ayend:"+ob.getAyEnd());
		System.out.println("id:"+ob.getId());
		System.out.println("name:"+ob.getName());
		System.out.println("course:"+ob.getCourse());
		System.out.println("aadharno:"+ob.getAadharno());
		
	}
}