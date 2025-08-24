package Lesson11_Compound_interest_cal;
import java.util.Scanner;

public class L11 {
    public static void main(String[] args) {
        double principal, rate, amount;
        int timecompounded, years;  

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Your original money investing on:");
        principal = scanner.nextDouble();
        System.out.print("Enter Your original money investing on:");
        rate = scanner.nextDouble() / 100; // divide by 100 because we turn percent to decimal
        System.out.print("Enter the # of times conpounded per year:");
        timecompounded = scanner.nextInt();
        System.out.print("Enter the # of years:");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate/timecompounded) , (timecompounded * years));
        
        System.out.printf("Your total amount is %.2f", amount);


        scanner.close();
    }
}
