/*class Testouter{
static int data=30;
static class Inner{
void msg(){
System.out.println("data is"+data);}
}
public static void main(String args[])
{
Testouter.Inner obj=new Testouter.Inner();
obj.msg();
}
}*/
class Testouter{
static int data=30;
static class Inner{
static void msg(){
System.out.println("data is"+data);}
}
public static void main(String args[])
{
Testouter.Inner.msg();
}
}