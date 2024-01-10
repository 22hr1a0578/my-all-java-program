abstract class A{
public void dis1(){
System.out.println("Concrete method of parent class");
}
abstract public void dis2();
}
class d extends A{
public void dis2()
{
System.out.println("overriding abstract method");
}
}
class T{
public static void main(String args[])
{
A obj;
obj =new d();
obj.dis1();
obj.dis2();
}
}