class Author
{
String autherName;
int age;
String place;
Author(String name,int age,String place)
{
this.autherName=name;
this.age=age;
this.place=place;
}
}
class book
{
String name;
int price;
Author author;

Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[])
{
Author author=new Author("John",24,"USA");
Book b=new Book("java for begginer",800,author);
System.out.println("Book name: "+b.name);
System.out.println("Book price: "+b.price);
System.out.println("======author details========");
System.out.println("Author name: "+b.author.authorName);
System.out.println("Author age: "+b.author.age);
System.out.println("Author place: "+b.author.place);
}
}




