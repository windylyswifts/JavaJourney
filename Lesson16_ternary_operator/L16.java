import java.util.Scanner;

public class L16 {
//ternary operator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("What is your score");
        score = scanner.nextInt();
        String passOrfail = (score >= 60) ? "FAILURE": "GOOD!";
    
        System.out.printf("%s", passOrfail);

        scanner.close();
    }
}
