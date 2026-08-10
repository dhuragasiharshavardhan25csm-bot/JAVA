import java.util.Scanner;

public class Input {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("enter your name :");
    String name=sc.nextLine();

    System.out.println("enter a number:");
    int number=sc.nextInt();

    System.out.println("enter a float:");
    float fee=sc.nextFloat();

    System.out.println("name is:"+name);
    System.out.println("number you enter is:"+number);
    System.out.println("fee you enter is:"+fee);

    sc.close();
    
  }    
}
