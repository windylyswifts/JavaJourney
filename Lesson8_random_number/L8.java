package Lesson8_random_number;
import java.util.Random;
import java.util.Scanner;


public class L8 {
    public static void main(String[] args) {
        int number;
        double decimals;
        boolean flip;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        number = random.nextInt(-10, 10);//the problem with this is that since there is no limiter, it its either negative bil or pos.
        //                                     just adding limitors inside solves the problem from min to max numer
        decimals = random.nextDouble(1, 10);
        flip = random.nextBoolean();

        System.out.print(number);
        System.out.print(decimals);
        System.out.print(flip);
        
        scanner.close();
    }
}
