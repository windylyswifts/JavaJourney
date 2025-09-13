package Lesson14_substring;
import java.util.Scanner;

public class L14 {
    public static void main(String[] args) {
        // .substring() =  A method used to extract a portion of a string
        //                 string.substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("What is your email:");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@")); //this will end on @
            domain = email.substring(email.indexOf("@") + 1); //what this basically do is once @ is found plus 1 so it ignores @
    
            System.out.println(username);
            System.out.println(domain);            
        }
        else{
            System.out.println("That ain't an email!");
        }
        scanner.close();
    }
}
