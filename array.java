import java.util.*;
class ArrayToMethod{
public int max(int[] array){
int max=0;
for(int i=0;i<array.length;i++){
if(array[i]>max){
max=array[i];}
}
return max;
}
public int min(int[] array){
int min=array[0];
for(int i=0;i<array.length;i++){
if(array[i]<min){
min=array[i];}
}
return min;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array that is created:");
int size=sc.nextInt();
int[] myArray=new int[size];
System.out.println("Enter the elements of the array: ");
for(int i=0;i<size;i++){myArray[i]=sc.nextInt();}
ArrayToMethod m=new ArrayToMethod();
System.out.println("maximum value in the arrayis: "+m.max(myArray));
System.out.println("minimum value in the array in: "+m.min(myArray));
}
}
