class B{
B(){
this(5);

System.out.println("hello B");
}
B(int x){

System.out.println(x);
}
}
class TestThis{
public static void main(String args[]){
B a=new B();
}
}