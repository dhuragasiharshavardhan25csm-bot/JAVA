import java.util.Scanner;

public class Week3 {

       public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n) && isPalindrome(n)) {
            System.out.println(n + " is a Prime Palindrome.");
        } else {
            System.out.println(n + " is NOT a Prime Palindrome.");
        }
        sc.close();
    }
}