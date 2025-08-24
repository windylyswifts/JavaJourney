import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String adjective1;
    String adjective2; 
    String adjective3;
    String noun1;
    String verb1;
    
    System.out.println("Let's play a game");    
    System.out.println("You input random adjevties, noun, and a verb");    
    System.out.println("and a set of paragraph will reveal along side with your adjective");    
    System.out.print("First Adjective:");    
    adjective1 = scanner.nextLine();

    System.out.print("Second Adjective:");
    adjective2 = scanner.nextLine();

    System.out.print("Third Adjevtive:");
    adjective3 = scanner.nextLine();

    System.out.print("Noun:");
    noun1 = scanner.nextLine();
    
    System.out.print("Verb:");
    verb1 = scanner.nextLine();
    

    System.out.println("Today was a " + adjective1 + " to have fun at home");
    System.out.println("It must've nice " + noun1 +"!");
    System.out.println("But " + adjective2 + " thing happened and I can't just go");
    System.out.println("It may take a while " + adjective3 + " long timeeee!");
    System.out.println("Better start " + verb1 + " on it rather than just waiting for nothing");
    
    scanner.close();
    }
}
