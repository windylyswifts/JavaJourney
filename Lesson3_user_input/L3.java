package Lesson3_user_input;
import java.util.Scanner; //basically a library

public class L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine(); //nextlin is basically a reader. "next" only reads the first string without white space
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("So Currently when your taking this course you are " + age + 
        " years old.");

        System.out.println("Type a number with decimal:");
        double decimal = scanner.nextDouble();
        System.out.print("good number, it's " + decimal + "\n");

        System.out.print("Is it true that you are currently single? ans. true or false:");
        boolean isSingle = scanner.nextBoolean();
        if (isSingle) 
            System.out.println("WP");
        else
            System.out.println("Damn too bad for you");
        scanner.close();
    }
}

