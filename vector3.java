import java.util.Iterator;
import java.util.Vector;
class main{
public static void main(String args[]){
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Horse");
animals.add("Cat");
String elements=animals.get(2);
System.out.println("Elements at index 2: "+elements);
Iterator<String>iterate=animals.iterator();
System.out.print("Vector: ");
while(iterate.hasNext()){
System.out.print(iterate.next());
System.out.print(",");
}
}
}