class person
{
int id;
String name;
person(int id,String name){
this.id=id;
this.name=name;
}
}
class emp extends person
{
float salary;
emp(int id,String name,float salary)
{
super(id,name);
this.salary=salary;
}
void display()
{System.out.println(id+" "+name+" "+salary);}
}
class Test4
{
public static void main(String arg[])
{
emp e1=new emp(1 ,"latha",45000);
e1.display();
}
}