class Animal
{
String color="White";
}
class Dog extends Animal{
String color="pink";
void PrintColor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper
{
public static void main(String args[])
{
Dog d=new Dog();
d.PrintColor();
}
}