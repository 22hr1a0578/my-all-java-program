import java.util.*;
class CharAtExample6{
ArrayList<Character>a1;
//connstructor for creating and asiigning values to the array list
CharAtExample6()
{
a1=new ArrayList<Character>();
a1.add('A');a1.add('E');a1.add('I');a1.add('O');a1.add('U');
a1.add('a');a1.add('e');a1.add('i');a1.add('o');a1.add('u');
// amethod that checks whether the character c is a vowel or not 
}
private boolean isVowels(char c)
{
for(int i=0;i<a1.size();i++)
{
if(c== a1.get(i)){return true;}
}
return false;
}
public int countVowels(String s)//method to calculate vowels in the string s
{
int countVowels=0;//store total  number of vowels
int size =s.length();//size of string
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowels(c))
{
countVowels=countVowels+1;//vowel found!increase the count by 1
}
}
return countVowels;
}
public static void main(String args[]){
//creating an object of the class CharAtExample6();
CharAtExample6 obj=new CharAtExample6();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowels=obj.countVowels(str);
System.out.println("String: "+str);
System.out.println("Total number of vowels in string are: "+noOfVowels+"\n");
}
}