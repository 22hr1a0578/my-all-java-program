class student{
int rollno;
String name;
static String college="MTIET";
static void college(){
college="vani";
}
student(int r,String n)
{
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[]){
student s=new student(100,"latha");
s.display();

student s1=new student(123,"shree");
student.college();//calling change method
student s2=new student(1234,"lathashree");
//s.display();
s1.display();
s2.display();
}
}