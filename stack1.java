import java.util.*;
class Test{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("latha");
stack.push("yamuna");
stack.push("neha");
stack.push("pallu");
stack.push("navya");
stack.push("neha");
stack.push("bhavya");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}



