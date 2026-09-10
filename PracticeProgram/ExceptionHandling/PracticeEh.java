import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message);
	}
}

class AgeChecker {
	Scanner sc;
    AgeChecker(Scanner sc){
        this.sc=sc;
    }

	void checkage() throws InvalidAgeException {
        int age;
		System.out.println("enter your age:");
		age = sc.nextInt();
		if (age < 18) {
			throw new InvalidAgeException("you are unable to vote");
		}
		System.out.println("you are eligible to vote");
	}
}

public class PracticeEh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AgeChecker o = new AgeChecker(sc);
		try {
			o.checkage();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException ime) {
			
			try {
                System.out.println("Invalid age entered");
                sc.next();
				o.checkage();
                
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}finally{
            System.out.println("agechecking process is completeed");
		sc.close();
        }
	}

}
