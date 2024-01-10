//abstract parent class 
abstract class Animal
{
//abstract menthod
public abstract void sound();
}
class Dog extends Animal{
public void sound()
{
System.out.println("WOOF");
}
public static void main(String args[])
{
Animal obj=new Dog();
obj.sound();
}
}