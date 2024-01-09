import java.util.Vector;
class main{
public static void main(String args[]){
Vector<String>grocery=new Vector<>();
grocery.add("gee");
grocery.add("salt");
grocery.add("milk");
grocery.add("curd");//using index number
grocery.add(2,"rice");
System.out.println("Vector: "+grocery);//using assAll()
Vector<String> items=new Vector<>();
items.add("crocodile");
items.addAll(grocery);
System.out.println("New vector: "+items);
}
}