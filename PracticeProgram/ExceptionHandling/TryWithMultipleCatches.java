import java.util.InputMismatchException;
import java.util.Scanner;

class B {
    int i = 200;
    int j;

    Scanner s = new Scanner(System.in);

    void sample() {
        try {
            System.out.println("enter the value of j:");
            j = s.nextInt();

            int k = i / j;
            System.out.println("the value of k=" + k);

        } catch (ArithmeticException e) {
            System.out.println("enter the correct value of j:");
            j = s.nextInt();
            int k = i / j;
            System.out.println("the value of k: " + k);
        } catch (InputMismatchException ime) {
            s.next();
            System.out.println("enter the value of  j");
            j = s.nextInt();
            int k = i / j;
            System.out.println("value of k " + k);
        }
        finally{
            System.out.println("catch is executed");
        }
    }

}

public class TryWithMultipleCatches {
    public static void main(String[] args) {
        System.out.println("main method");
        B b = new B();
        b.sample();
    }
}
