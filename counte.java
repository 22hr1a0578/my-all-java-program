class counter
{
static int count=0;//will get only once and retain its value
counter(){
count++;//incrementing the value of static variable
System.out.print(count);
}
public static void main(String args[]){
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
}
}