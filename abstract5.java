abstract class Bank{
abstract float getRateOfInterest();
}
class SBI extends Bank{
float getRateOfInterest(){return 7.4f;}
}
class PNB extends Bank{
float getRateOfInterest(){return 8.5f;}
}
class PLV extends Bank{
float getRateOfInterest(){return 2.6f;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");
b=new PLV();
System.out.println("Rate of interest is:"+b.getRateOfInterest()+"%");

}
}