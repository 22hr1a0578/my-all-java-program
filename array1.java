//sum and average of an array elements

class array1
{
public static void main(String args[])
{
int[] numbers={2,-9,0,5,12,-25,22,9,8,12};

int sum=0;
double average;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("average="+average);
}
}