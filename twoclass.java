class A{
public void funA1(){
System.out.println("funA1 called class A");
}
public void funA2(){
System.out.println("funA2 called class a");
}
}
class B
{
public static void main(String args[]){
A ob=new A();
ob.funA1();
ob.funA2();
}
}