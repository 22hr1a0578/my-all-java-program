class Animal{
public void eat()
{
System.out.println("i can eat");
}
}
class Dog1 extends Animal
{
//@override
public void eat()
{
System.out.println("i eat dog food");
}
public void bark()
{
System.out.println("i can bark");
}
}
class Test{
public static void main(String args[]){
Dog l=new Dog();
l.eat();
l.bark();
}
}

