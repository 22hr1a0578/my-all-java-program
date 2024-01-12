class Person{
protected String fname="latha";
protected String Iname="shree";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2018;
public static void main(String args[]){
Student myObj=new Student();
System.out.println("Name: "+myObj.fname+" "+myObj.Iname);
System.out.println("Age:"+myObj.age);
System.out.println("Graduation Year: "+myObj.graduationYear);
}
}
