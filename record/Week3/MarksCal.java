import java.util.Scanner;

public class MarksCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int total=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the marks in subject "+i+":");
            int marks=sc.nextInt();
            total=total+marks;

        }
        double avg=(double)total/5;

        System.out.println("total marks in 5 subjects is:"+total);
        System.out.println("average of marks:"+avg);
        sc.close();
    }
}
