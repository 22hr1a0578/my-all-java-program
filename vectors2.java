import java.util.Vector;
class main{
public static void main(String args[]){
Vector<String>friends=new Vector<>();
friends.add("yamuna");
friends.add("bhavya");
friends.add("pallu");
friends.add("neha");//using index number
friends.add(2,"latha");
System.out.println("Vector: "+friends);//using assAll()
Vector<String> bestfrnds=new Vector<>();
bestfrnds.add("navya");
bestfrnds.addAll(friends);
System.out.println("New vector: "+bestfrnds);
}
}