package Lesson12_nested_if;
import java.util.Scanner;

public class L12 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your current age:");
        age = scanner.nextInt();
        if (age >= 18) {
            if (age <= 45) {
                System.out.println("Too Old!");
            }
            else{
                System.out.println("PEAK ERA!");
            }
        }
        else if(age < 0)
            System.out.println("Dude you are unalive");
        else if(age < 18){
            System.out.println("too young");
        }

        scanner.close();
    }
}
