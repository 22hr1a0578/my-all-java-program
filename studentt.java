class  studentt{
int rollno;
String name,course;
float fee;
studentt(int rollno,String name,String course)
{
	this.rollno=rollno;
	this.name=name;
	this.course=course;
}
studentt(int rollno,String name,String course,float fee)
{
	this(rollno,name,course);
	this.fee=fee;
}

void display(){
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis7
{
public static void main(String args[]){
studentt s1=new studentt(123,"latha","java");
studentt s2=new studentt(123,"latha","java",20.7f);
s1.display();
s2.display();
}
}