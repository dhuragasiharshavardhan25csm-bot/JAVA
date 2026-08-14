class Book {
    int bookId;
    String bookName;
    String author;
    double price;

    Book(int bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    void method2(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

}



class Book1{
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    //constructer
    Book1(){
        bookId=0;
        bookName="unknown";
        author="unknown";
        price=0.00;
    }

    //constructer with parameters
    Book1(int id,String name,String aut,double p){
        bookId=id;
        bookName=name;
        author=aut;
        price=p;
    }
      // getters & setters for Encapsulation
    public int getBookId(){
         return bookId; 
        }
    public void setBookId(int id){
         bookId = id;
         }

    public String getBookName(){ 
        return bookName; 
    }
    public void setBookName(String name){ 
        bookName = name; 
    }

    public String getAuthor(){
         return author; 
        }
    public void setAuthor(String aut){
         author = aut; 
        }

    public double getPrice(){ return price; 

    }
    public void setPrice(double p){ 
        price = p; 
    }

    public void details() {
        System.out.println(bookId + " | " + bookName + " | " + author + " | " + price);
    }
}


// inheritance super:person sub:student and faculty
class Person {
    void method1(){
        System.out.println("output from class person");
    }
}
class Student extends Person {
    void method2(){
        System.out.println("output from class student which inherit person");
    }
}

class Faculty extends Person {
    void method3(){
        System.out.println("output from class faculty which inherits person");
    }
}


//polymorph
class AreaCalculator {
    double area(double radius) { 
        return Math.PI * radius * radius;
    }
  double area(double length, double breadth) { 
        return length * breadth;
    }
    double area(double base, double height, boolean triangle) { 
            return 0.5 * base * height;
    }
}

class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
} 


// abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing Report...");
    }
}

public class Task2{
    public static void main(String[] args){
         Book b1 = new Book(101, "Java Programming", "James Gosling", 450);
     //  Book b2 = new Book(102, "Data Structures", "Mark Allen", 550);
        b1.method2();

         Book1 obj=new Book1(298137,"javaclass","nani",20.3);
         obj.details();

         Student obj1=new Student();
         obj1.method1();
         obj1.method2();

         Faculty obj2=new Faculty();
         obj2.method1();
         obj2.method3();

         Vehicle v = new Vehicle();
         Vehicle car = new Car();
         Vehicle bike = new Bike();
         v.display();
         car.display();
         bike.display();

         Shape circle = new Circle();
         Shape rectangle = new Rectangle();
         circle.draw();
         rectangle.draw();
         Report report = new Report();
         report.print();
    }
}
