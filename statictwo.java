class A{
public static void funA1(){
System.out.println("funA1 called class A");
}
public static void funA2(){
System.out.println("funA2 called class a");
}
}
class B
{
public static void main(String args[]){
A.funA1();
A.funA2();
}
}