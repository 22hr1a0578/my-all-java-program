import java.util.*;
class student{
private int id;
private String name;
private String departement;
public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;}
public void setDepartement(String departement){
this.departement=departement;}
public int getId(){return this.id;}
public String getName(){return this.name;}
public String getDepartement(){return this.departement;}
}
class Day8Program{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
student[] ob= new student[5];
for(int i=0;i<5;i++){
ob[i]=new student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDepartement(sc.next());
}
System.out.println("Detail are:\n");
for(int j=0;j<5;j++){
System.out.println("ID:"+ob[j].getId());
System.out.println("NAME:"+ob[j].getName());
System.out.println("DEPARTEMENT:"+ob[j].getDepartement());

}
}
}