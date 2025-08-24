package Lesson7_If_statements;
import java.util.Scanner;

public class L7 {
    public static void main(String[] args) {
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Whats your name?");
        name = scanner.nextLine();
        if (name.isEmpty()) 
            System.out.println("You didn't input a name");
   
        System.out.print("What is your current Age:");
        age = scanner.nextInt();

        System.out.print("Are you currently a student? True or false");
        isStudent = scanner.nextBoolean();

        if (isStudent) 
            System.out.print("Great, Nice having you here");
        else
            System.out.println("damn you suck");

        if (age < 18)
            System.out.println("you are still a minor");
        else if(age > 45)
            System.out.println("you are so old dawg");
        else
            System.out.println("prime age");

        scanner.close();
    }
}
