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
class cat extends Animal
{
void meow()
{
System.out.println("meowing......");
}
}
class Test
{
public static void main(String args[])
{
cat d=new cat();
d.meow();
d.eat();
Dog c=new Dog();
c.bark();
c.eat();

}
}