import java.util.Scanner;
class A{
    Scanner sc=new Scanner(System.in);
    int x=10,y;
   
    void display(){
        System.out.println("eneter the value of y:");
        y=sc.nextInt();
     try{
     int b=x/y;
     System.out.println("the value of b="+b);
    
     }catch(ArithmeticException ae){
      System.out.println("cannot perform the division");
     }
    }
}
public class TryCatch {
    public static void main(String[] args){
        System.out.println("hello");
        A obj=new A();
        obj.display();
    }
}
