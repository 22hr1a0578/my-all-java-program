//append
/*class StringBuilderExample{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello ");
sb.append("latha");
System.out.println(sb);
}
}*/
//insertion
/*class example{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello ");
sb.insert(1,"latha");
System.out.println(sb);
}}*/
//replace
/*class Example1
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello ");
sb.replace(1,3,"latha");
System.out.println(sb);
}
}*/
//delete
/*class exmple2
{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("hello ");
sb.delete(0,1);
System.out.println(sb);
}
}*/
//reverse
/*class exmple2
{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("hello ");
sb.reverse();
System.out.println(sb);
}
}*/
//capacity
class example
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());//default 16
sb.append("Hello ");
System.out.println(sb.capacity());//now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());//now(16*2)+2=34 ie (oldcapacity*2)+2
}
}