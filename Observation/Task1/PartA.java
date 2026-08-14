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
public class PartA{
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James Gosling", 450);
      //  Book b2 = new Book(102, "Data Structures", "Mark Allen", 550);
        b1.method2();
       
    }
}