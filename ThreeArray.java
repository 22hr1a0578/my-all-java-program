class ThreeArray
{
public static void main(String args[])
{
int [][][] test={
{
{1,-2,3}, {2,3,4}, {10,11,12}  },
{   {-4,-5,6,9},  {1},   {2,3} }
};
for(int[][] array2D:test){
for(int[] arrayID:array2D){
for(int item:arrayID){
System.out.println(item);
}
}
}
}
}