package record;

import record.Week9;
import java.util.Scanner;

public class ImportRoman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Number: ");
        String roman = sc.nextLine();

        Week9 r = new Week9();

        int result = r.romanToInteger(roman);

        System.out.println("Integer Value: " + result);

        sc.close();
    }
}