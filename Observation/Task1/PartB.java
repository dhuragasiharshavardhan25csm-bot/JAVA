class Book{
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    //constructer
    Book(){
        bookId=0;
        bookName="unknown";
        author="unknown";
        price=0.00;
    }

    //constructer with parameters
    Book(int id,String name,String aut,double p){
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
public class PartB {
    public static void main(String[] args){
        Book obj=new Book(298137,"javaclass","nani",20.3);
        obj.details();
    }
}
