package Lesson9_math_class;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, b, result;
        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        System.out.println("WELCOME TO CALCULATE FOR HYPOTENUSE");
        System.out.println("Enter your numbers:");
        System.out.println("First number:");
        a = scanner.nextDouble();
        System.out.println("Second number:");
        b = scanner.nextDouble();
        result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    
        System.out.println("Here is the result:" + result);

        scanner.close();
    }
}
