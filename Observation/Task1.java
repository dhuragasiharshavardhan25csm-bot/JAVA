import java.util.Scanner;

class PartD {

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
}

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Part A");
            System.out.println("2. Part B");
            System.out.println("3. Part C");
            System.out.println("4. Part D");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ================= PART A =================
                case 1:

                    sc.nextLine();

                    System.out.println("Enter the name of student:");
                    String name = sc.nextLine();

                    System.out.println("Enter the rollno. of student:");
                    int rollno = sc.nextInt();

                    System.out.println(
                        "Enter the marks of student in four subjects:"
                    );

                    int S1 = sc.nextInt();
                    int S2 = sc.nextInt();
                    int S3 = sc.nextInt();
                    int S4 = sc.nextInt();

                    int totalmarks = S1 + S2 + S3 + S4;
                    double percentage = totalmarks / 4.0;

                    System.out.println("\n===== STUDENT INFORMATION =====");
                    System.out.println("Name: " + name);
                    System.out.println("RollNo.: " + rollno);
                    System.out.println("Total marks: " + totalmarks);
                    System.out.println("Percentage: " + percentage + "%");

                    break;

                // ================= PART B =================
                case 2:

                    System.out.println("\n===== PART B =====");
                    System.out.println("1. Even or Odd");
                    System.out.println("2. Largest of 3 Numbers");
                    System.out.println("3. Grade");
                    System.out.println("4. Days of a Week");

                    System.out.print("Enter your choice: ");
                    int partBChoice = sc.nextInt();

                    switch (partBChoice) {

                        case 1:

                            System.out.println("Enter a number:");
                            int num = sc.nextInt();

                            if (num % 2 == 0) {
                                System.out.println(
                                    num + " is an even number"
                                );
                            } else {
                                System.out.println(
                                    num + " is an odd number"
                                );
                            }

                            break;

                        case 2:

                            System.out.println("Enter 3 numbers:");

                            int a = sc.nextInt();
                            int b = sc.nextInt();
                            int c = sc.nextInt();

                            if (a >= b && a >= c) {
                                System.out.println(
                                    a + " is the largest number"
                                );
                            } else if (b >= a && b >= c) {
                                System.out.println(
                                    b + " is the largest number"
                                );
                            } else {
                                System.out.println(
                                    c + " is the largest number"
                                );
                            }

                            break;

                        case 3:

                            System.out.println("Enter the percentage:");
                            double per = sc.nextDouble();

                            if (per >= 90) {
                                System.out.println("Grade A");
                            } else if (per >= 80) {
                                System.out.println("Grade B");
                            } else if (per >= 70) {
                                System.out.println("Grade C");
                            } else if (per >= 60) {
                                System.out.println("Grade D");
                            } else {
                                System.out.println("Grade E");
                            }

                            break;

                        case 4:

                            System.out.println(
                                "Enter the Day number (1-7):"
                            );

                            int day = sc.nextInt();

                            switch (day) {

                                case 1:
                                    System.out.println("Monday");
                                    break;

                                case 2:
                                    System.out.println("Tuesday");
                                    break;

                                case 3:
                                    System.out.println("Wednesday");
                                    break;

                                case 4:
                                    System.out.println("Thursday");
                                    break;

                                case 5:
                                    System.out.println("Friday");
                                    break;

                                case 6:
                                    System.out.println("Saturday");
                                    break;

                                case 7:
                                    System.out.println("Sunday");
                                    break;

                                default:
                                    System.out.println(
                                        "Enter a valid day number"
                                    );
                            }

                            break;

                        default:
                            System.out.println(
                                "Invalid Part B choice."
                            );
                    }

                    break;

                // ================= PART C =================
                case 3:

                    System.out.println("\n===== PART C =====");
                    System.out.println("1. Multiplication Table");
                    System.out.println("2. Numbers from 1 to N");
                    System.out.println("3. Sum of N Natural Numbers");
                    System.out.println("4. Fibonacci Series");

                    System.out.print("Enter your choice: ");
                    int partCChoice = sc.nextInt();

                    switch (partCChoice) {

                        case 1:

                            System.out.println(
                                "Enter a number for multiplication table:"
                            );

                            int tableNum = sc.nextInt();

                            System.out.println(
                                "Multiplication table of "
                                + tableNum + ":"
                            );

                            for (int i = 1; i <= 10; i++) {
                                System.out.println(
                                    tableNum + " x " + i
                                    + " = " + (tableNum * i)
                                );
                            }

                            break;

                        case 2:

                            System.out.println("Enter a number N:");
                            int N = sc.nextInt();

                            System.out.println(
                                "Numbers from 1 to " + N + ":"
                            );

                            for (int i = 1; i <= N; i++) {
                                System.out.println(i);
                            }

                            break;

                        case 3:

                            System.out.println("Enter a number N:");
                            int N1 = sc.nextInt();

                            int sum = 0;

                            for (int i = 1; i <= N1; i++) {
                                sum += i;
                            }

                            System.out.println(
                                "Sum of first " + N1
                                + " natural numbers: " + sum
                            );

                            break;

                        case 4:

                            System.out.println("Enter a number:");
                            int N2 = sc.nextInt();

                            int x = 0;
                            int y = 1;

                            System.out.println(
                                "Fibonacci Series up to "
                                + N2 + ":"
                            );

                            while (x <= N2) {

                                System.out.print(x + " ");

                                int next = x + y;
                                x = y;
                                y = next;
                            }

                            System.out.println();

                            break;

                        default:
                            System.out.println(
                                "Invalid Part C choice."
                            );
                    }

                    break;

                // ================= PART D =================
                case 4:

                    System.out.println("\n===== PART D =====");

                    PartD obj = new PartD();

                    System.out.println("1. Factorial");
                    System.out.println("2. Prime");
                    System.out.println("3. Maximum of Two Numbers");
                    System.out.println("4. Area of Circle");

                    System.out.print("Enter your choice: ");
                    int partDChoice = sc.nextInt();

                    switch (partDChoice) {

                        case 1:

                            System.out.println("Enter a number:");
                            int N3 = sc.nextInt();

                            int fact = obj.factorial(N3);

                            System.out.println(
                                "Factorial of " + N3
                                + " is " + fact
                            );

                            break;

                        case 2:

                            System.out.println("Enter a number:");
                            int N4 = sc.nextInt();

                            boolean isPrime = obj.prime(N4);

                            if (isPrime) {
                                System.out.println("Prime Number");
                            } else {
                                System.out.println(
                                    "Not a Prime Number"
                                );
                            }

                            break;

                        case 3:

                            System.out.println("Enter 1st number:");
                            int num1 = sc.nextInt();

                            System.out.println("Enter 2nd number:");
                            int num2 = sc.nextInt();

                            System.out.println(
                                "Maximum = "
                                + obj.max(num1, num2)
                            );

                            break;

                        case 4:

                            System.out.println("Enter radius:");
                            double r = sc.nextDouble();

                            System.out.println(
                                "Area = "
                                + obj.areaOfCircle(r)
                            );

                            break;

                        default:
                            System.out.println(
                                "Invalid Part D choice."
                            );
                    }

                    break;

                // ================= EXIT =================
                case 0:

                    System.out.println("Exiting...");

                    break;

                // ================= INVALID =================
                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 0);

        sc.close();
    }
}