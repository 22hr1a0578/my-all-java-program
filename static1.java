class student{
int rollno;
String name;
static String college="MTIET";
student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.print(rollno+" "+name+" "+college);
}
public static void main(String args[]){
student s=new student(100,"latha");
student s1=new student(123,"shree");
s1.college="absc";
s.display();
s1.display();
}
}