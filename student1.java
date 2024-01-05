class student1{
int id;
String name;
student1(int i,String n){
id=i;
name=n;
}
student1(){}
void display()
{
System.out.println(id+" "+name);}
public static void main(String args[]){
student1 s1=new student1(123,"latha");
student1 s2=new student1();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}