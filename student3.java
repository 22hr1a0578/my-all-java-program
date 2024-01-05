class Student3{
int rollnumber;
String name;
float fee;
Student3(int rollnumber,String name,float fee)
{
this.rollnumber=rollnumber;
this.name=name;
this.fee=fee;
}
void display(){
System.out.println(rollnumber+" "+name+" "+fee);}

}
class TestThis {
public static void main(String args[]){
Student3 s1=new Student3(111,"latha",20.8f);
s1.display();
}
}
