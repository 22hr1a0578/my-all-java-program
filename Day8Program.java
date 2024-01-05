class student{
private int id;
private String name;
public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day8Program{
public static void main(String args[]){
student[] ob= new student[3];
ob[0]=new student();
ob[0].setId(121);
ob[0].setName("Test");
System.out.println("ID:"+ob[0].getId());
System.out.println("NAME:"+ob[0].getName());
ob[1]=new student();
ob[1].setId(122);
ob[1].setName("Test");
System.out.println("ID:"+ob[1].getId());
System.out.println("NAME:"+ob[1].getName());
ob[2]=new student();
ob[2].setId(123);
ob[2].setName("Test");
System.out.println("ID:"+ob[2].getId());
//System.out.print("\n");
System.out.println("NAME:"+ob[2].getName());

/*student ob1=new student();
student ob2=new student();
student ob3=new student();
ob1.setId(1111);
ob1.setName("latha");
ob2.setId(123);
ob2.setName("shree");
ob3.setId(456);
ob3.setName("lathashree");
System.out.print("ID:"+ob1.getId());
System.out.print("\n");
System.out.print("NAME:"+ob1.getName());
System.out.print("\n");
System.out.print("ID:"+ob2.getId());
System.out.print("\n");
System.out.print("NAME:"+ob2.getName());
System.out.print("\n");
System.out.print("ID:"+ob3.getId());
System.out.print("\n");
System.out.print("NAME:"+ob3.getName());*/
}
}