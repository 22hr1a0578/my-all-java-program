class Animal
{
void eat()
{
System.out.println("eating....");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("barking......");
}
}
class Babydog extends Dog
{
void weep()
{
System.out.println("weeping......");
}
class Test
{
public static void main(String args[])
{
Babydog d=new Babydog();
d.weep();
d.bark();
d.eat();
}
}
}