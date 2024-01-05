class array{
public static void main(String args[]){
//creat and array
int[] age={1,2,4,5,2,5};
//access each array elements via index
System.out.println("Accessing elements of Array");
System.out.println("first Element:"+age[0]);
System.out.println("second Element:"+age[1]);
System.out.println("third Element:"+age[2]);
System.out.println("fourth Element:"+age[3]);
System.out.println("fifth Element:"+age[4]);
System.out.println("for each loop");
System.out.println("\n");
for(int a:age)//for each loop
{
System.out.println(a);
}
System.out.println("\n");

System.out.println("for loop");
for(int i=0;i<age.length;i++)//for loop
{
System.out.println(age[i]);
}
}
}