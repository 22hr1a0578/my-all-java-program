abstract class Animal{
public abstract void sound();
}
class dog extends Animal{
public void sound()
{
System.out.println("woof");}
}
class lion extends Animal{
public void sound(){System.out.println("Roars");}
}
class Cat extends Animal{
public void sound(){System.out.println("Mews");}
}
class Test{
public static void main(String args[]){
Animal obj;
obj=new dog(); 
obj.sound();
obj=new lion();
obj.sound();
obj=new Cat();
obj.sound();
}
}