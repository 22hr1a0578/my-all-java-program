class Person{
public void move(){System.out.println("Yamuna can move");}
}
class People extends Person{
public void move() { 
System.out.println("neha can walk and run");
}
}
class Test{
public static void main(String args[]){
Person a=new Person();
Person b=new People();
a.move();
b.move();
}
}