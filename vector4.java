import java.util.*;
 class VectorExample1{
public static void main(String args[]){
Vector<String>vec=new Vector<String>(4);
vec.add("Tiger");
vec.add("Lion");
vec.add("Dog");
vec.add("Elephant");
System.out.println("Size is: "+vec.size());
System.out.println("Default capacity is:"+vec.capacity());
System.out.println("vector elements is: "+vec);
vec.addElement("Rat");
vec.addElement("Cat");
vec.addElement("Deer");
System.out.println("Size after addition is: "+vec.size());
System.out.println("Capacity after addition is: "+vec.capacity());
System.out.println("elements are: "+vec);
if(vec.contains("Tiger"))
{
System.out.println("tiger is present at index"+vec.indexOf("Tiger"));
}
else
{
System.out.println("Tiger is not present in the list");
}
System.out.println("the first animal of the vector is= "+vec.firstElement());
System.out.println("the last animal of the vector is = "+vec.lastElement());
}
}