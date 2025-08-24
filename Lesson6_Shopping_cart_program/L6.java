package Lesson6_Shopping_cart_program;
import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item; 
        int quantities;
        double price, result;

        System.out.println("WELCOME TO THE SHOPPING CART PROGRAM");
        System.out.println("What Item you'd be buying today?");
        item = scanner.nextLine();

        System.out.println("How much is the " + item + " cost?");
        price = scanner.nextDouble();

        System.out.println("How much did you bought?");
        quantities = scanner.nextInt();

        result = quantities * price;

        System.out.println("Alright your total amount from your item/s is " + result);

        scanner.close();
    }
}
