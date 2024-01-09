import java.util.Vector;
class main{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("horse");//using index number
mammals.add(2,"car");
System.out.println("Vector: "+mammals);//using assAll()
Vector<String> animals=new Vector<>();
animals.add("crocodile");
animals.addAll(mammals);
System.out.println("New vector: "+animals);
}
}